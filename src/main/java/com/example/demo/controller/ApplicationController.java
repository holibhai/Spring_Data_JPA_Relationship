package com.example.demo.controller;

import com.example.demo.entity.Application;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/add/{applicantId}")
    public ResponseEntity<Application>add(@RequestBody Application application,@PathVariable int applicantId) {
        return ResponseEntity.ok(applicationService.addApplication(application,applicantId));
    }
}
