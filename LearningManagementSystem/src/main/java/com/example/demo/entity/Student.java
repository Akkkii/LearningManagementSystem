package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String address;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
