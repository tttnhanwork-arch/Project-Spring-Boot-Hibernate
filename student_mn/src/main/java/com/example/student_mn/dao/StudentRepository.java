package com.example.student_mn.dao;

import com.example.student_mn.entity.ScoreSheet;
import com.example.student_mn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController(path = "students")
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
