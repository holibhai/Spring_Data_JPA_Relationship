package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String status;
    private String phone;
    private String email;

    @OneToOne(mappedBy = "applicant",cascade = CascadeType.ALL)
    private Resume resume;


    @OneToMany(mappedBy = "applicant",cascade = CascadeType.ALL)
    private List<Application> application=new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "applicants_jobs",
            joinColumns = @JoinColumn(name = "applicant_id"),
            inverseJoinColumns = @JoinColumn(name = "job_id")
    )
    @JsonIgnore
    private List<Job> jobs=new ArrayList<>();


    public Applicant(int id, String name, String status, String phone, String email) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.phone = phone;
        this.email = email;
    }

    public Applicant() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public List<Application> getApplication() {
        return application;
    }

    public void setApplication(List<Application> application) {
        this.application = application;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
