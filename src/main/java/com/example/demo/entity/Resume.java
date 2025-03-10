package com.example.demo.entity;

import ch.qos.logback.core.boolex.EvaluationException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;


    @OneToOne
    @JoinColumn(name = "applicant_id", nullable=false)
    @JsonIgnore
    private Applicant applicant;

    public Resume(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public Resume() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
