package com.example.demo.service;


import com.example.demo.entity.Applicant;
import com.example.demo.entity.Application;
import com.example.demo.entity.Resume;
import com.example.demo.repo.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepo applicantRepo;



    public Applicant add(Applicant applicant) {
         Resume resume=applicant.getResume();
         List<Application>applications=applicant.getApplication();
         if(resume!=null){
             resume.setApplicant(applicant);

         }
         if(applications!=null){
             for(Application application:applications){
                 application.setApplicant(applicant);
             }
         }
        return applicantRepo.save(applicant);
    }
}
