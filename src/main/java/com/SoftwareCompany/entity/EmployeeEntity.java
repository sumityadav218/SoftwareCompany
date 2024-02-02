package com.SoftwareCompany.entity;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "public" , name = "employee")
public class EmployeeEntity {
	
	@Id
	@Column(name = "emp_id")
	int empId ;
	
	@Column(name = "first_name")
	String firstName ;
	
	@Column(name = "last_name")
	String lastName ;
	
	@Column(name = "department_id")
	int deptId ;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
			
	
}
