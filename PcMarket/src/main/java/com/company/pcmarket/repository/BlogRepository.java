package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "blogs",collectionResourceRel = "list")
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
