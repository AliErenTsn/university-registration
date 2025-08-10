package com.example.university.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.Entity.Course;
import com.example.university.Repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository couRep;

	public List<Course> getAllCourses() {
		return couRep.findAll();
	}

	public Optional<Course> getCourseById(Long id) {
		return couRep.findById(id);
	}
}
