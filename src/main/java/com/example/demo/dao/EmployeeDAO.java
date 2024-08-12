package com.example.demo.dao;

import com.example.demo.enitity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();

    public Employee findById(Integer id);

    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Employee employee);
}
