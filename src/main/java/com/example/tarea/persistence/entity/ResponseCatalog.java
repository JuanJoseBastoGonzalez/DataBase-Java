package com.example.tarea.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "response_catalogs")
public class ResponseCatalog {

    @Id
    private Long id;
    private Integer responseOption;
    private Integer catalogId;
    private Integer questionId;
    private String responseText;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResponseOption() {
        return responseOption;
    }

    public void setResponseOption(Integer responseOption) {
        this.responseOption = responseOption;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    @Override
    public String toString() {
        return "ResponseCatalogs{" +
                "id=" + id +
                ", responseOption=" + responseOption +
                ", catalogId=" + catalogId +
                ", questionId=" + questionId +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
