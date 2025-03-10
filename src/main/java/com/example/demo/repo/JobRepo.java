package com.example.demo.repo;

import com.example.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job,Integer> {
}
