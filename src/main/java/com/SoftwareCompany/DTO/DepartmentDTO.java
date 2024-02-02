package com.SoftwareCompany.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDTO {
	int deptId  ; 
	String deptName ;
	
	
	public DepartmentDTO(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	} 
	
	

}
