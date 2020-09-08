package com.deborger.springboot.thymeleafdemo.service;

import java.util.List;

import com.deborger.springboot.thymeleafdemo.enity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
