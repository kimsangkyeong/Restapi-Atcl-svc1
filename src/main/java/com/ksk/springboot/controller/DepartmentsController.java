package com.ksk.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksk.springboot.exception.ResourceNotFoundException;
import com.ksk.springboot.model.Departments;
import com.ksk.springboot.repository.DepartmentsRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/svc1/v1")
public class DepartmentsController {

	@Autowired
	private DepartmentsRepository departmentsRepository; 
	
	//get all departments
	@GetMapping("/departments")
    public List<Departments> getDepartments() {
    	return departmentsRepository.findAll();
    }
	
	//create department
	@PostMapping("/departments")
	public Departments createDepartment(@RequestBody Departments department) {
		return departmentsRepository.save(department);
	}
	
	// get department by dept_no rest api
	@GetMapping("/departments/{dept_no}")
	public ResponseEntity<Departments> getDepartmentByDeptno(@PathVariable String dept_no) {
		Departments department = departmentsRepository.findById(dept_no)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found by deptno : " + dept_no));
		return  ResponseEntity.ok(department);
		
	}	
	
}
