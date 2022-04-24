package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "product",collectionResourceRel = "list")
public interface ProductRepository extends JpaRepository<Product,UUID> {
    Page findByNameStartingWith(@Param("name") String name, Pageable pageable);
}
