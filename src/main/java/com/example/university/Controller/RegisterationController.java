package com.example.university.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.Entity.Course;
import com.example.university.Entity.Registeration;
import com.example.university.Entity.Student;
import com.example.university.Repository.CourseRepository;
import com.example.university.Repository.RegisterationRepository;
import com.example.university.Repository.StudentRepository;
import com.example.university.Service.CourseService;

@RestController
@RequestMapping("registration")
public class RegisterationController {

	@Autowired
	RegisterationRepository regRep;

	@Autowired
	CourseRepository couRep;

	@Autowired
	StudentRepository stuRep;

	String result = " ";

	@GetMapping("courses")
	public String getCourses() {

		result = "";
		couRep.findAll().forEach(course -> {
			result += course.getId() + " " + course.getTitle() + "<br>";
			course.getRegisteraiton().forEach(reg -> {
				result += reg.getStudent().getName() + " " + reg.getStudent().getSurname() + " " + reg.getGrade()
						+ "<br>";
			});
			result += "<br>";
		});
		return result;
	}

	@GetMapping("students")
	public String getStudents() {

		stuRep.findAll().forEach(student -> {
			result += student.getName() + " " + student.getSurname() + "<br>";
			student.getRegisteraiton().forEach(reg -> {
				result += reg.getStudent().getName() + " " + reg.getStudent().getSurname() + " " + reg.getGrade()
						+ "<br>";
			});
			result += "<br>";
		});
		return result;
	}

	@GetMapping("student/{id}")
	public String getStudent(@PathVariable Long id) {
		Student temp_stu = stuRep.findById(id).get();
		result += temp_stu.getName() + " " + temp_stu.getSurname() + "<br>";
		temp_stu.getRegisteraiton().forEach(reg -> {
			result += reg.getStudent().getName() + " " + reg.getStudent().getSurname() + " " + reg.getGrade() + "<br>";
		});
		result += "<br>";
		return result;
	}

	@GetMapping("new/{stuId}/{courseId}/{grade}")
	public String addRegistration(@PathVariable Long stuId, @PathVariable Long courseId, @PathVariable int grade) {

		Registeration reg = new Registeration();
		reg.setCourse(couRep.findById(courseId).get());
		reg.setStudent(stuRep.findById(stuId).get());
		reg.setGrade(grade);

		regRep.save(reg);
		return "Registration Completed!";
	}

	@GetMapping("drop/{stuId}/{courseId}")
	public String dropRegistration(@PathVariable Long stuId, @PathVariable Long courseId) {

		regRep.deleteById(regRep.findAll().stream()
				.filter(reg -> reg.getCourse().getId() == courseId && reg.getStudent().getStudentId() == stuId)
				.findFirst().get().getRegisterationId());

		return "Registration Deleted!";

	}

}
