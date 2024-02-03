package com.SoftwareCompany.DTO;

import lombok.Getter;
import lombok.Setter;


public class DepartmentDTO {
	int deptId  ; 
	String deptName ;
	
	
	
	
	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public DepartmentDTO() {
		super();
	}


	public DepartmentDTO(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	} 
	
	

}
