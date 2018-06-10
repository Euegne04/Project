package com.luv2code.springdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.EmployeeDAO;
import com.luv2code.springdemo.entity.Employee;
import com.luv2code.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/list")
	//@PostMapping("/list")
	public String listEmployeers(Model theModel){
		
		
		List<Employee> theEmployee= employeeService.getEmployeers();
		
		
		theModel.addAttribute("employeers", theEmployee);
		
		
		return "list-employeers";// название jsp файла
		
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		
		
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
		
		
		employeeService.saveEmployee(theEmployee);		
		
		return "redirect:/employee/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
		
		
		Employee theEmployee = employeeService.getEmployee(theId);
			
		
		theModel.addAttribute("employee", theEmployee);
		
		
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId){
		
		
		employeeService.deleteEmployee(theId);
		
		return "redirect:/employee/list";
	}
}
