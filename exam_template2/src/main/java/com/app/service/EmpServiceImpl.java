package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dto.EmployeeDto;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees(String dept) {
		Department department=Department.valueOf(dept);
		List<Employee> emp=empRepo.findByDepartment(department);
		return emp;
	}

	@Override
	public String addEmployee(Employee emp) {
		String mseg="Failed to add employee";
		
		if(empRepo.save(emp)!=null) {
			mseg="Employee added successfully";
		}
		return mseg;
	}

	@Override
	public String updateEmployee(Long id,EmployeeDto employee) {
//		String mseg="Failed to update employee";
//		if(empRepo.save(emp)!=null) {
//			mseg="Employee updated successfully";
//		}
//		return mseg;
		Employee emp=empRepo.findById(id).orElseThrow();
		Department department=Department.valueOf(employee.getDepartment());
		emp.setName(employee.getName());
		emp.setDepartment(department);
		emp.setLocation(employee.getLocation());
		emp.setJoindate(employee.getJoindate());
		emp.setSalary(employee.getSalary());
		
		empRepo.save(emp);
		return "succesfully updated";
	}

	@Override
	public String deleteEmployee(Long empId) {
		String mseg="Failed to delete employee";
		if(empRepo.existsById(empId)) {
			empRepo.deleteById(empId);
			mseg="Employee deleted successfully";
		}
		return mseg;
	}

}
