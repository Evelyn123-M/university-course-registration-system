package com.university.university.repository;
import com.university.university.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long>{}

