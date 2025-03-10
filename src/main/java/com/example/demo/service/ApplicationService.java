package com.example.demo.service;

import com.example.demo.entity.Applicant;
import com.example.demo.entity.Applicant;
import com.example.demo.entity.Application;
import com.example.demo.repo.ApplicantRepo;
import com.example.demo.repo.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepo applicationRepo;

    @Autowired
    private ApplicantRepo applicantRepo;

    public Application addApplication(Application application,int applicantId) {
        Optional<Applicant> applicant = applicantRepo.findById(applicantId);
        if(applicant.isPresent()) {
            Applicant applican = applicant.get();
            application.setApplicant(applican);
            return applicationRepo.save(application);
        }else{
            throw new RuntimeException("appicant not found");
        }


    }

}
