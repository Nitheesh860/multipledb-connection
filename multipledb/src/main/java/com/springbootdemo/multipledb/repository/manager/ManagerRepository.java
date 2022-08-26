package com.springbootdemo.multipledb.repository.manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipledb.model.employee.Manager;



@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}