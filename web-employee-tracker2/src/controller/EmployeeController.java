package controller;


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

//	// need to inject the customer dao
//	@Autowired // автоматический поиск нужного класса
//	private CustomerDAO customerDAO;
	
	// need to inject our customer service
	@Autowired
	private EmployeeService employeeService;
	
	//@RequestMapping("/list") // адресс в браузере
	@GetMapping("/list")
	//@PostMapping("/list")
	public String listEmployeers(Model theModel){
		
		// get customers from the dao/service
		//List<Customer> theCustomers= customerDAO.getCustomers();
		List<Employee> theEmployee= employeeService.getEmployeers();
		
		// add customers to the model
		theModel.addAttribute("employeers", theEmployee);
		
		
		return "list-employeers";// название jsp файла
		
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		
		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
		
		// save the customer using our service
		employeeService.saveEmployee(theEmployee);		
		
		return "redirect:/employee/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
		
		// get the customer from database
		Employee theEmployee = employeeService.getEmployee(theId);
			
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
		
		// send over to our form
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId){
		
		// delete customer
		employeeService.deleteEmployee(theId);
		
		return "redirect:/employee/list";
	}
}
