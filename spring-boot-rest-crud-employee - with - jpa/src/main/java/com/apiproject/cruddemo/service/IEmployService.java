package com.apiproject.cruddemo.service;

import com.apiproject.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
