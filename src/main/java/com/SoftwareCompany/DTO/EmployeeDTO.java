package com.SoftwareCompany.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

	int empid  ;
	String firstName ; 
	String lastName; 
	int deptId ;
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
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


	public EmployeeDTO(int empid, String firstName, String lastName, int deptId) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
	}


	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	

}
