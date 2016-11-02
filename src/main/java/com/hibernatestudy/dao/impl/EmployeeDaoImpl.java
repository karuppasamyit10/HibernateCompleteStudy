/**
 * 
 */
package com.hibernatestudy.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernatestudy.dao.EmployeeDao;
import com.hibernatestudy.entity.Employee;
import com.hibernatestudy.repository.EmployeeRepository;

/**
 * @author Karuppu
 *
 */
@Transactional
@Service
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Map<String, Object> addEmployee(Employee employee) throws Exception {
		Map<String, Object> response = new HashMap<>();
		try {
				employeeRepository.save(employee);
				response.put("response_code", "0");
				response.put("response_message", "Successfully Saved");
				response.put("response", "");
		} catch (Exception e) {
		}
		return response;
	}
}
