package com.example.tarea.persistence.entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveys")
public class Survey{

    @Id
    @OneToMany(mappedBy = "survey")
private List<Chapter> chapters;

    @OneToMany(mappedBy = "survey")
private List<Response> responses;

    private Long id;
    private Timestamp createAt;
    private Timestamp updatedAt;
    private String description;
    private String name;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Surveys{" +
                "id=" + id +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
