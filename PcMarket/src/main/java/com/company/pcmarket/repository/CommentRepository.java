package com.company.pcmarket.repository;

import com.company.pcmarket.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments",collectionResourceRel = "list")
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
