package com.SoftwareCompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SoftwareCompany.DTO.EmployeeDTO;
import com.SoftwareCompany.entity.repository.EmployeeRepo;
import com.SoftwareCompany.service.Service;




@RestController
@RequestMapping("/Heirarchy")
public class Controller {
	
	@Autowired
	EmployeeRepo repo  ; 
	
	@Autowired
	Service service ; 
	
	
	
	//Read api 
	@RequestMapping(value ="/getEmpName", method = RequestMethod.GET)
	public EmployeeDTO fetchEmpDetails(@RequestParam  int empId) {
		return  service.fetchEmpDetails(empId) ; 
	}
	
	//Delete Api
	@RequestMapping(value="/deleteByEmp/{empId}",method = RequestMethod.DELETE)
	public void deleteEmpDetails(@PathVariable int empId) {
	//	int empId= empDto.getEmpid() ; 
		 service.deleteEmpDetails(empId) ;
	}
	//Put or Update api 
	@RequestMapping(value="/updateEmp/{empId}",method = RequestMethod.POST)
	public void updateEmpDetails(@PathVariable int empId,@RequestBody EmployeeDTO updatedEmployeeDTO) {
		service.updateEmpDetails(empId,updatedEmployeeDTO) ; 
		
	}
	
	//Create Api
	@RequestMapping(value="/addEmployee",method  = RequestMethod.POST)
	public void addEmpdetails(@RequestBody EmployeeDTO newEmployeeDTO) {
		service.addEmpDetails(newEmployeeDTO) ; 
	}
	
	
	@GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the simple API!";
    }
	


}
