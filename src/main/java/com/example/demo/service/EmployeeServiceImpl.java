package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.enitity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElseThrow(() -> new RuntimeException("Employee id not found - " + id));
    }

    //    @Transactional  --> not needed in spring data JPA
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    //    @Transactional
    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
