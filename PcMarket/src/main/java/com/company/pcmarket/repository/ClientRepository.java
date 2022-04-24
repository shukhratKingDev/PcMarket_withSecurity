package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "client",collectionResourceRel = "list")
public interface ClientRepository extends JpaRepository<Client, UUID> {
}
