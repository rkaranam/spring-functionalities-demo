package com.springfunctionalities.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springfunctionalities.demo.dao.EmployeeDao;
import com.springfunctionalities.demo.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeVO> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}

}
