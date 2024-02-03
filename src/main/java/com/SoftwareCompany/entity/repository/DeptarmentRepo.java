package com.SoftwareCompany.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SoftwareCompany.entity.DepartmentEntity;

@Repository
public interface DeptarmentRepo extends JpaRepository<DepartmentEntity, Integer> {

	
	
	
	

}
