package com.springfunctionalities.demo.dao;

import java.util.List;

import com.springfunctionalities.demo.model.EmployeeVO;

public interface EmployeeDao {

	List<EmployeeVO> getAllEmployees();

}