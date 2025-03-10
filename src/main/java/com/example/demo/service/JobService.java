package com.example.demo.service;

import com.example.demo.entity.Applicant;
import com.example.demo.entity.Job;
import com.example.demo.repo.ApplicantRepo;
import com.example.demo.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    @Autowired
    private ApplicantRepo applicantRepo;


    public Job add(Job job) {
        return jobRepo.save(job);
    }
    public Applicant addjobToApplicant(int jobId, int applicantId) {
        System.out.println("find it");
        Optional<Applicant> applicant = applicantRepo.findById(applicantId);
        Optional<Job> job = jobRepo.findById(jobId);
        if (applicant.isPresent() && job.isPresent()) {
            System.out.println("find it");
            applicant.get().getJobs().add(job.get());
            applicantRepo.save(applicant.get());
            return applicant.get();

        } else {
             throw new IllegalArgumentException("Applicant not found");
        }
    }


}
