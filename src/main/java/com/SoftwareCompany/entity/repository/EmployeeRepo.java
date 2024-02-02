package com.SoftwareCompany.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.SoftwareCompany.DTO.EmployeeDTO;
import com.SoftwareCompany.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{
	
	  @Query(value = "SELECT first_name FROM employee WHERE emp_id = :empId",
	  nativeQuery = true) String empNameById(@Param("empId") int empId);
	 


}
