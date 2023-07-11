package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> allEmpDetails() {

		return empRepo.findAll();
	}

	@Override
	public String addEmpData(Employee emp) {
           
		String mesg = "failed to add employee details";
		 
			if(	empRepo.save(emp) != null) 
				
			  mesg = "empDetails add Successfully !!!!!!!!!!!!!!";
           
			return mesg;
	}

	@Override
	public String updateEmpData(Employee emp) {
	            
	       
			String mesg = "failed to update employee details";
			 
				if(	empRepo.save(emp) != null) 
					
				  mesg = "empDetails update Successfully !!!!!!!!!!!!!!";
	           
				return mesg;
	}

	@Override
	public String deleteEmpData(Long empId) {
		
		String mesg = "failed to delete employee details";
		 
		if(empRepo.existsById(empId)) { 
			empRepo.deleteById(empId);
		  mesg = " EmpId : "+empId+"\n deleted Successfully !!!!!!!!!!!!!!";
		}
		return mesg;
	}

}
