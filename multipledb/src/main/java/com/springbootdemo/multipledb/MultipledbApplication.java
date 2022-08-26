package com.springbootdemo.multipledb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.multipledb.model.employee.Manager;
import com.springbootdemo.multipledb.model.manager.Employee;
import com.springbootdemo.multipledb.repository.employee.EmployeeRepository;
import com.springbootdemo.multipledb.repository.manager.ManagerRepository;

@SpringBootApplication
@RestController
public class MultipledbApplication {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ManagerRepository managerRepository;
	
	@PostMapping
	public void saveData() {
		employeeRepository.saveAll(Stream.of(new Employee("Nitheeshkumar", "nitheesh860@gmail.com", 10000), new Employee("Kalaiselvan", "kalai123@gmail.com", 13000), new Employee("Dileepkumar", "dileep76@gmail.com", 15000), new Employee("Yamini", "yamini12334@gmail.com", 20000)).collect(Collectors.toList()));
		managerRepository.saveAll(Stream.of(new Manager("Dharmasankar", "dharma123s@gmail.com",200000)).collect(Collectors.toList()));
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getManager")
	public List<Manager> getManager() {
		return managerRepository.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(MultipledbApplication.class, args);
	}

}