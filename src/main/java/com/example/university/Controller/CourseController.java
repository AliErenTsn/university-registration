package com.example.university.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.Entity.Course;
import com.example.university.Service.CourseService;

@RestController
@RequestMapping("courses")
public class CourseController {

	@Autowired
	CourseService couSer;

	@GetMapping
	public List<Course> getCourses() {
		return couSer.getAllCourses();
	}

	@GetMapping("{id}")
	public Optional<Course> getCourse(@PathVariable Long id) {
		return couSer.getCourseById(id);
	}

}
