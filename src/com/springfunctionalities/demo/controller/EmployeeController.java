package com.springfunctionalities.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springfunctionalities.demo.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController {

	@Autowired
	private EmployeeManager employeeManager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("employees", employeeManager.getAllEmployees());
		return "employeesDisplayList";
	}

}
