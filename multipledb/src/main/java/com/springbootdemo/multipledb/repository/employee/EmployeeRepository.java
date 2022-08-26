package com.springbootdemo.multipledb.repository.employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipledb.model.manager.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}