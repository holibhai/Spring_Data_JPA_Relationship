package com.example.demo.controller;

import com.example.demo.entity.Applicant;
import com.example.demo.entity.Job;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private  JobService jobService;

    @PostMapping("/added")
    public ResponseEntity<Applicant>addedeToApplicant(@RequestParam int jobId,@RequestParam int applicantId){
        return ResponseEntity.ok(jobService.addjobToApplicant(jobId,applicantId));

    }

    @PostMapping("/addjob")
    public ResponseEntity<Job>addjob(@RequestBody Job job){
        return ResponseEntity.ok(jobService.add(job));
    }
}
