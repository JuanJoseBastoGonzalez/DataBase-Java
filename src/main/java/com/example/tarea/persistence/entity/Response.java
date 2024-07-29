package com.example.tarea.persistence.entity;

import java.sql.Time;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @ManyToOne
    
@JoinColumn(name = "catalog_id", referencedColumnName = "id")
private Catalog catalog;

@JoinColumn(name = "survey_id", referencedColumnName = "id")
private Survey survey;

    private Long id;
    private Time responseTime;
    private Timestamp responseDate;
    private Integer surveyId;
    private String nameRespondent;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Time responseTime) {
        this.responseTime = responseTime;
    }

    public Timestamp getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Timestamp responseDate) {
        this.responseDate = responseDate;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getNameRespondent() {
        return nameRespondent;
    }

    public void setNameRespondent(String nameRespondent) {
        this.nameRespondent = nameRespondent;
    }

    @Override
    public String toString() {
        return "Responses{" +
                "id=" + id +
                ", responseTime=" + responseTime +
                ", responseDate=" + responseDate +
                ", surveyId=" + surveyId +
                ", nameRespondent='" + nameRespondent + '\'' +
                '}';
    }
}
