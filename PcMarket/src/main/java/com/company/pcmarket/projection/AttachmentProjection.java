package com.company.pcmarket.projection;

import com.company.pcmarket.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    String getName();
}
