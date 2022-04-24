package com.company.pcmarket.projection;

import com.company.pcmarket.entity.Attachment;
import com.company.pcmarket.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    String getName();
    Attachment getContentType();
}
