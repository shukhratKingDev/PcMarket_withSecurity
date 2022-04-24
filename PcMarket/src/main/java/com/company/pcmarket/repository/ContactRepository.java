package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contacts",collectionResourceRel = "list")
public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
