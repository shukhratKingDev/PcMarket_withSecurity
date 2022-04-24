package com.company.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PcMarket {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable=false)
    private String name;
    private String branchName;
    private boolean active;
    @OneToOne
    private Contact contact;
    @OneToMany
    private List<Supplier> supplier;
}
