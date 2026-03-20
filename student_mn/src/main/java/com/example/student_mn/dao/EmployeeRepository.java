package com.example.student_mn.dao;

import com.example.student_mn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
