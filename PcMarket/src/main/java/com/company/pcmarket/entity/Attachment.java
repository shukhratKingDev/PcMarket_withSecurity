package com.company.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Attachment {
    @Id
    private UUID id;
    @Column(nullable=false)
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private AttachmentContent contentType;
}
