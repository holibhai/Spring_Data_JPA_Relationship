package com.example.demo.service;


import com.example.demo.entity.Applicant;
import com.example.demo.entity.Applicant;
import com.example.demo.entity.Resume;
import com.example.demo.repo.ApplicantRepo;
import com.example.demo.repo.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {


    @Autowired
    private ResumeRepo resumeRepo;
    @Autowired
    private ApplicantRepo applicantRepo;


    public Resume addResume(Resume resume,int applicantId) {
        Optional<Applicant> applicantOpt = applicantRepo.findById(applicantId);
        if (applicantOpt.isPresent()) {
            Applicant applicant = applicantOpt.get();
            resume.setApplicant(applicant);
            resumeRepo.save(resume);
        }else{
              throw new RuntimeException("Applicant not found");
        }
    return resume;
    }
}
