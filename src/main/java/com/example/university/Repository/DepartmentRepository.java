package com.example.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
