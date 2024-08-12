package com.example.demo.rest;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.enitity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findOne(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        System.out.println(employee);
        return employee;
    }

    @PostMapping("/employees")
    public Employee save(Employee employee) {
        return employeeService.save(employee);
    }

}
