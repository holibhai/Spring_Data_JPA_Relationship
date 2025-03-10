package com.example.demo.repo;

import com.example.demo.entity.Applicant;
import com.example.demo.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepo extends JpaRepository <Applicant,Integer> {


}
