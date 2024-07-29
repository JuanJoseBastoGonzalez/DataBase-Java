package com.example.tarea.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_responses")
public class DetailResponse {

    @Id
    @ManyToOne
@JoinColumn(name = "catalog_id", referencedColumnName = "id")
private Catalog catalog;

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
        return "DetailResponses{" +
                "id=" + id +
                ", responseOption=" + responseOption +
                ", catalogId=" + catalogId +
                ", questionId=" + questionId +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
