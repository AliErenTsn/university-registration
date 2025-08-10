package com.example.university.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Registeration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long registerationId;
	int Grade;

	@ManyToOne
	Course courses;

	@ManyToOne
	Student student;

	public Long getRegisterationId() {
		return registerationId;
	}

	public void setRegisterationId(Long registerationId) {
		this.registerationId = registerationId;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}

	public Course getCourse() {
		return courses;
	}

	public void setCourse(Course course) {
		this.courses = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
