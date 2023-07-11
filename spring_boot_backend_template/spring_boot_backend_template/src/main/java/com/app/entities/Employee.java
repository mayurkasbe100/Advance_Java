package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emp")
@ToString(exclude = "password")
@NoArgsConstructor
@Getter
@Setter

public class Employee extends BaseEntity {

	//| id | email  unique       | first_name | join_date  | last_name | location       | password   notnull | salary
	
	@Column(name = "first_name"  , length = 50 )
	private String firstName;
	@Column(name = "last_name"  , length = 50 )
	private String lastName;
	@Column(name = "email"  , unique = true)
	private String email;
	@Column(name = "join_date")
	private LocalDate joinDate;
	@Column(name = "location"  , length = 100 )
	private String location;
	@Column(name = "password"  , length = 50 , nullable = false )
	private String password;
	@Column(name = "salary")
	private double salary;
	
	
	public Employee(String firstName, String lastName, String email, LocalDate joinDate, String location,
			String password, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.joinDate = joinDate;
		this.location = location;
		this.password = password;
		this.salary = salary;
	}
	
	
	
	
	
}
