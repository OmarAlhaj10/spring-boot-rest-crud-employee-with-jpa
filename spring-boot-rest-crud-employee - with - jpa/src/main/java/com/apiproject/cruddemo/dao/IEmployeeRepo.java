package com.apiproject.cruddemo.dao;

import com.apiproject.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
}
