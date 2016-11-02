/**
 * 
 */
package com.hibernatestudy.dao;

import java.util.Map;

import com.hibernatestudy.entity.Employee;

/**
 * @author Karuppu
 *
 */
public interface EmployeeDao {

	public Map<String, Object> addEmployee(Employee employee) throws Exception;	
}
