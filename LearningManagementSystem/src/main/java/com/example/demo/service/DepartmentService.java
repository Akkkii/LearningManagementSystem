package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository repository;
	
	public Department addDepartment(Department dept) {
		return repository.save(dept);
	}
	
	public Department getDepartmentById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>) repository.findAll();
		return depts;
	}
	
	public void deleteDepartment(Department dept) {
		repository.delete(dept);
	}
	
	public Department updateDepartment(Department dept, Long id) {
		Department oldDept = repository.findById(id).get();
		
		if(oldDept.getDeptName()!=null) {
			oldDept.setDeptName(dept.getDeptName());
		}
		
		if(oldDept.getDeptEmail() != null) {
			oldDept.setDeptEmail(dept.getDeptEmail());
		}
		
		return repository.save(oldDept);
	}
		
}
	
	

