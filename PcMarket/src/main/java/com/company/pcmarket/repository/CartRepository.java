package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cart",collectionResourceRel = "list")
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
