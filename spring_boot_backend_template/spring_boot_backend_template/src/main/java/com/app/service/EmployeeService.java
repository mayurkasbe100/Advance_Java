package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entities.Employee;

@Service
public interface EmployeeService {

	List<Employee> allEmpDetails();

	String addEmpData(Employee emp);

	String updateEmpData(Employee emp);

	String deleteEmpData(Long empId);

	
}
