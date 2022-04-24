package com.company.pcmarket.projection;

import com.company.pcmarket.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Blog.class)
public interface Blog {
    String getText();
    String getSourceLink();
    List<Attachment> getAttachment() ;

}
