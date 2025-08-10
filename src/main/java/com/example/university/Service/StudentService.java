package com.example.university.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.university.Entity.Student;
import com.example.university.Repository.CourseRepository;
import com.example.university.Repository.DepartmentRepository;
import com.example.university.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRep;

	@Autowired
	DepartmentRepository deptRep;

	@Autowired
	CourseRepository couRep;

	public List<Student> getStudents() {
		return stuRep.findAll();
	}

	public Optional<Student> getStudent(Long id) {
		return stuRep.findById(id);
	}

	public void newStudent(Student s, Long id) {

		deptRep.findById(id).get().getStudents().add(s);
		s.setDepartment(deptRep.findById(id).get());
		stuRep.save(s);
	}
	
	public void removeStudent(Long id) {
		stuRep.deleteById(id);
	}

}
