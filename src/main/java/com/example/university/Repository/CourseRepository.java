package com.example.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
