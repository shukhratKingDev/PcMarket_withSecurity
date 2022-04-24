package com.company.pcmarket.repository;

import com.company.pcmarket.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
