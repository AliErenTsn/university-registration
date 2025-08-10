package com.example.university.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.Entity.Student;
import com.example.university.Service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	// www.mysite.com/students
	@Autowired
	StudentService stuSer;

	@GetMapping
	public List<Student> getStudentList() {
		return stuSer.getStudents();
	}

	// www.mysite.com/students/id
	@GetMapping("{id}")
	public Optional<Student> getAStudent(@PathVariable Long id) {
		return stuSer.getStudent(id);
	}

	// www.mysite.com/students/save
	@PostMapping("save/{id}")
	public String saveStudent(@RequestBody Student s, @PathVariable Long id) {
		stuSer.newStudent(s, id);
		return "Student Saved";
	}

	// www.mysite.com/students/id
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable Long id) {
		stuSer.removeStudent(id);
		return "Student deleted!";
	}


}
