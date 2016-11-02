/**
 * 
 */
package com.hibernatestudy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernatestudy.dao.EmployeeDao;
import com.hibernatestudy.entity.Employee;

/**
 * @author Karuppu
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/employee/add", produces = "application/json")
	@ResponseBody
	public Map<?, ?> addEmployee(Employee employee) throws Exception {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("method_name", "EMPLOYEE INFO SAVE");
		response.put("response", "");
		try {
			response=employeeDao.addEmployee(employee);
		} catch (Exception e) {
		}
		return response;
	}
	
}
