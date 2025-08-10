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

import com.example.university.Entity.Department;
import com.example.university.Service.DepartmentService;

@RestController
@RequestMapping("departments")
public class DepartmentController {

	@Autowired
	DepartmentService deptSer;

	@GetMapping
	public List<Department> getDepartments() {
		return deptSer.getDepartments();
	}

	@GetMapping("{id}")
	public Optional<Department> getDepartment(@PathVariable Long id) {
		return deptSer.getDepartment(id);
	}

	@PostMapping("save")
	public String saveDept(@RequestBody Department d) {
		deptSer.newDepartment(d);
		return "Department Saved";
	}

	@DeleteMapping("{id}")
	public String deleteDept(@PathVariable Long id) {
		deptSer.removeDepartment(id);
		return "Department deleted!";
	}

}
