package com.example.firstproject.models.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "abstarct_entity")
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "lastmodified_date")
    private LocalDateTime lastModifiedDate;
    @Version
    private Integer version;

    public AbstractEntity(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Integer version) {
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.version = version;
    }

    public AbstractEntity() {

    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }
}
