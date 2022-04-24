package com.company.pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PutMapping;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("superAdmin").password(passwordEncoder().encode("superAdmin")).roles("SUPER_ADMIN")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator")).roles("MODERATOR")
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator")).roles("OPERATOR");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api/**").hasAnyRole("SUPER_ADMIN","MODERATOR","OPERATOR")
                .antMatchers(HttpMethod.POST,"/api/**").hasAnyRole("SUPER_ADMIN","MODERATOR","OPERATOR")
                .antMatchers(HttpMethod.PUT,"/api/**").hasAnyRole("SUPER_ADMIN","MODERATOR")
                .antMatchers(HttpMethod.DELETE,"/api/**").hasRole("SUPER_ADMIN")
                .anyRequest().authenticated()
                .and().httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

//    https://pcmarket.uz saytining security qismini yozish. Bunda inMemory da 3 ta user qo'shiladi.
//    SUPER_ADMIN, MODERATOR va OPERATOR rollari bo’lsin.
//    SUPER_ADMIN har qanday ishni qila oladi;
//    MODERATOR mahsulot qo’sha oladi va tahrirlay oladi ,ammo o’chira olmaydi;
//    OPERATOR buyurtmalar bilan ishlaydi, mahsulotni o'chira olmaydi va tahrirlay olmaydi.
}
