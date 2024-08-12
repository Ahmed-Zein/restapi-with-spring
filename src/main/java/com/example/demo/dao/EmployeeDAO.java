package com.example.demo.dao;

import com.example.demo.enitity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();

    public Employee findById(Integer id);

    public Employee save(Employee employee);

    public void deleteById(Integer id);
}
