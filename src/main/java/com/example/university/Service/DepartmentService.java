package com.example.university.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.Entity.Department;
import com.example.university.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository deptRep;

	public List<Department> getDepartments() {
		return deptRep.findAll();
	}

	public Optional<Department> getDepartment(Long id) {
		return deptRep.findById(id);
	}

	public void newDepartment(Department d) {
		deptRep.save(d);
	}

	public void removeDepartment(Long id) {
		deptRep.deleteById(id);
	}

}
