package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",collectionResourceRel = "list")
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
