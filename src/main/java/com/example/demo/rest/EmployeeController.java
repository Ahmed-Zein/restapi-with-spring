package com.example.demo.rest;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.enitity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    EmployeeDAO employeeDAO;

    @Autowired
    EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/")
    public List<Employee> xxx() {
        return employeeDAO.findAll();
    }

}
