package com.learning.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name,gender;
	
	@Autowired
	@Qualifier(value = "add2")
	private EAddress address;
	
	public Employee() {
		id = 111;
		name = "Guest";
		gender = "male";
		System.out.println("Employee.Employee()");
	
	}
	
	

	public EAddress getAddress() {
		return address;
	}


	
	public void setAddress(EAddress address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}



	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.Employee(3)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	
	
}
