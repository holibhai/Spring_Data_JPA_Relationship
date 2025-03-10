package com.example.demo.controller;


import com.example.demo.entity.Resume;
import com.example.demo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;


    @PostMapping ("/addResume/{applicantId}")
    public ResponseEntity<Resume>add(@RequestBody Resume resume,@PathVariable int applicantId) {
        return ResponseEntity.ok(resumeService.addResume(resume,applicantId));
    }
}
