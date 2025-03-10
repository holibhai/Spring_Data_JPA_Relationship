package com.example.demo.repo;

import com.example.demo.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo extends JpaRepository<Resume, Integer> {
}
