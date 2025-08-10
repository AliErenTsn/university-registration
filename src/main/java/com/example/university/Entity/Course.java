package com.example.university.Entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String title;

	@JsonBackReference
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	List<Registeration> registeraiton;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Registeration> getRegisteraiton() {
		return registeraiton;
	}

	public void setRegisteraiton(List<Registeration> registeraiton) {
		this.registeraiton = registeraiton;
	}

}
