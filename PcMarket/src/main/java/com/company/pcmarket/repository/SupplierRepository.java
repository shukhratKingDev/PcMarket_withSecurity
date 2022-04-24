package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list")
public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
}
