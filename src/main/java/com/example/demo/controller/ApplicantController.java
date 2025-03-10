package com.example.demo.controller;


import com.example.demo.entity.Applicant;
import com.example.demo.repo.ApplicantRepo;
import com.example.demo.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;


    @PostMapping("/add")
    public ResponseEntity<Applicant> add(@RequestBody Applicant applicant) {
        return ResponseEntity.ok(applicantService.add(applicant));
    }

}
