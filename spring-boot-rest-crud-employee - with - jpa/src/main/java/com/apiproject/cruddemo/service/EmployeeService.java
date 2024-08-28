package com.apiproject.cruddemo.service;

import com.apiproject.cruddemo.dao.IEmployeeRepo;
import com.apiproject.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployService{

    private IEmployeeRepo employeeRepo;


    @Autowired
    public EmployeeService(IEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepo.findById(id);
        Employee employee = null;
        if (result.isPresent()) {
            employee = result.get();
        }else{
            throw new RuntimeException("Employee not found");
        }
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }
}
