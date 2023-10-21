package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/save")
	private Department save(Department dept) {
		return service.addDepartment(dept);
	}
	
	@GetMapping("/getDepartmentById/{id}")
	private Department getDepartmentById(@PathVariable Long id) {
		return service.getDepartmentById(id);
	}
	
	@GetMapping("/getAllDepartments")
	private List<Department> getAllDepartments() {
		return service.getAllDepartments();
	}
	
	@PutMapping("/updateDepartment")
	private Department updateDepartment(@RequestBody Department dept, Long id) {
		return service.updateDepartment(dept, id);
	}
	
	@DeleteMapping("/deleteDepartment")
	private String deleteDepartment(Department dept) {
		service.deleteDepartment(dept);
		return "Department Deleted Successfully";
	}
	
	
	
}
