package com.example.tarea.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "response_options")
public class ResponseOption {

    @Id
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private Long id;
    private String optionValue;
    private Integer questionId;
    private String responseText;
    private Integer questionParent;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
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

    public Integer getQuestionParent() {
        return questionParent;
    }

    public void setQuestionParent(Integer questionParent) {
        this.questionParent = questionParent;
    }

    @Override
    public String toString() {
        return "ResponseOptions{" +
                "id=" + id +
                ", optionValue='" + optionValue + '\'' +
                ", questionId=" + questionId +
                ", responseText='" + responseText + '\'' +
                ", questionParent=" + questionParent +
                '}';
    }
}
