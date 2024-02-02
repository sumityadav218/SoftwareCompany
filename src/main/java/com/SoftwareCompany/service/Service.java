package com.SoftwareCompany.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.SoftwareCompany.DTO.EmployeeDTO;
import com.SoftwareCompany.entity.EmployeeEntity;
import com.SoftwareCompany.entity.repository.EmployeeRepo;
@org.springframework.stereotype.Service
public class Service {
	
	
	@Autowired 
	EmployeeRepo employeeRepo ; 
	
	
	public EmployeeDTO fetchEmpDetails (int empId) {
		EmployeeDTO empDto =  new EmployeeDTO() ; 
	Optional<EmployeeEntity> entity =	employeeRepo.findById(empId) ; 
	empDto.setDeptId(entity.get().getDeptId());
	empDto.setEmpid(entity.get().getEmpId());
	empDto.setFirstName(entity.get().getFirstName());
	empDto.setLastName(entity.get().getLastName());
	
		return empDto ; 
	}
	
	
	public void deleteEmpDetails(int empId) {
	try {

		employeeRepo.deleteById(empId);
		
	} catch (Exception e) {
		System.out.println("Exception occured while deleting from Employee details");
	}	
	}


	public void updateEmpDetails(int empId, EmployeeDTO updatedEmployeeDTO) {
	
		EmployeeEntity empEntity = new EmployeeEntity()  ; 
		empEntity.setEmpId(empId);
		empEntity.setDeptId(updatedEmployeeDTO.getDeptId());
		empEntity.setFirstName(updatedEmployeeDTO.getFirstName());
		empEntity.setLastName(updatedEmployeeDTO.getLastName());

	
		employeeRepo.save(empEntity) ; 
	}


	public void addEmpDetails(EmployeeDTO newEmployeeDTO) {
		EmployeeEntity empEntity = new EmployeeEntity()  ; 
		
		empEntity.setEmpId(newEmployeeDTO.getEmpid());
		empEntity.setDeptId(newEmployeeDTO.getDeptId());
		empEntity.setFirstName(newEmployeeDTO.getFirstName());
		empEntity.setLastName(newEmployeeDTO.getLastName());
		employeeRepo.save(empEntity) ; 
		
	}

}
