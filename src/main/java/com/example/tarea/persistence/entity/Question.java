package com.example.tarea.persistence.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @ManyToOne
@JoinColumn(name = "chapter_id", referencedColumnName = "id")
private Chapter chapter;

    @OneToMany(mappedBy = "question")
private List<ResponseOption> responseOptions;

    private Long id;
    private Integer chapterId;
    private Integer parentQuestionId;
    private String questionNumber;
    private String questionText;
    private String responseType;
    private String commentQuestion;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getParentQuestionId() {
        return parentQuestionId;
    }

    public void setParentQuestionId(Integer parentQuestionId) {
        this.parentQuestionId = parentQuestionId;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getCommentQuestion() {
        return commentQuestion;
    }

    public void setCommentQuestion(String commentQuestion) {
        this.commentQuestion = commentQuestion;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", chapterId=" + chapterId +
                ", parentQuestionId=" + parentQuestionId +
                ", questionNumber='" + questionNumber + '\'' +
                ", questionText='" + questionText + '\'' +
                ", responseType='" + responseType + '\'' +
                ", commentQuestion='" + commentQuestion + '\'' +
                '}';
    }
}
