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

import com.example.demo.entity.Student;
import com.example.demo.entity.Trainer;
import com.example.demo.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/save")
	private Student saveStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}

	@GetMapping("/find/{id}")
	private Student findStudentById(@PathVariable Long id) {
		return service.getStudentById(id);
	}

	@GetMapping("/findAll")
	private List<Student> findAllStudents() {
		return service.getAllStudents();
	}

	@DeleteMapping("/delete/{id}")
	private String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "Student Deleted Successfully";
	}
	
//	@PutMapping("/update/{id}")
//	private Student updateStudent(@RequestBody Student student, @PathVariable Long id) {
//		return service.updateStudent(student, id);
//	}
	
	private Student updateStudent(@RequestBody Student student, @PathVariable Long id) {
		return service.updateStudent(student, id);
	}

}
