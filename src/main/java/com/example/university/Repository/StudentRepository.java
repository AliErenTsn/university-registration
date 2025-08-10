package com.example.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
