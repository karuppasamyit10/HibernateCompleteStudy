/**
 * 
 */
package com.hibernatestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernatestudy.entity.Employee;

/**
 * @author Karuppu
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
