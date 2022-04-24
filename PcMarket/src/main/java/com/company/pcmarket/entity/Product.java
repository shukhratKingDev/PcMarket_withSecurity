package com.company.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable=false)
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    private Attachment photo;
    @Column(nullable=false,unique = true)
    private String code;
    @ManyToOne(cascade = CascadeType.ALL)
    private Measurement measurementId;
    @ManyToOne
    private Currency currency;
    private boolean active;

}
