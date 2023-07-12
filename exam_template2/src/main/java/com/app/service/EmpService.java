package com.app.service;

import java.util.List;

import com.app.Dto.EmployeeDto;
import com.app.entities.Employee;

public interface EmpService {

	List<Employee> getAllEmployees(String dept);
	
	String addEmployee(Employee emp);
	
	String updateEmployee(Long id,EmployeeDto emp);
	
	String deleteEmployee(Long empId);
	
}
