package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Trainer;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public Student getStudentById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

//	public Student updateStudent(Student s, Long id) {
//		
//		Student student = repository.findById(id).get();
//		
//		if(student.getName() != null) {
//			student.setName(s.getName());
//		}
//		if(student.getAddress() != null) {
//			student.setAddress(s.getAddress());
//		}
//		return repository.save(student);
//	}
	
	public Student updateStudent(Student correctStudent, Long id) {
		Student student = repository.findById(id).get();
		
		if(student.getName() != null) {
			student.setName(correctStudent.getName());
		}
		if(student.getAddress() != null) {
			student.setAddress(correctStudent.getAddress());
		}			
		return repository.save(student);
	}
	
	
}
