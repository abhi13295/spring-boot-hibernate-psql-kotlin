package com.outleap.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.envers.Audited;

import java.util.Date;

abstract class BaseEntity {

    @CreationTimestamp
    @Column(name = "created_at")
    Date createdAt = new Date();

    @UpdateTimestamp
    @Column(name = "updated_at")
    Date updatedAt = new Date();

    @JsonIgnore
    @Column(name = "updated_by")
    Long updatedBy = null;

    @JsonIgnore
    @Column(name = "ip_address")
    @Audited
    String ipAddress = null;

    @JsonIgnore
    @Column(name = "is_delete")
    @Audited
    Boolean isDeleted = null;
}
