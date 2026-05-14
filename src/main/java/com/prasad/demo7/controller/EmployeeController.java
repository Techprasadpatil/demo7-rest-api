package com.prasad.demo7.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prasad.demo7.dto.EmployeeDTO;
import com.prasad.demo7.entity.Employee;
import com.prasad.demo7.mapper.EmployeeMapper;
import com.prasad.demo7.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @Autowired
    private EmployeeMapper mapper;

    // Save Employee
    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody Employee employee) {

        Employee savedEmployee = service.saveEmployee(employee);

        return mapper.toDTO(savedEmployee);
    }

    // Get All Employees
    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {

        List<Employee> employees = service.getAllEmployees();

        return employees.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    // Get Employee By Id
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {

        Employee employee = service.getEmployeeById(id);

        return mapper.toDTO(employee);
    }

    // Update Employee
    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id,
                                      @RequestBody Employee employee) {

        Employee updatedEmployee = service.updateEmployee(id, employee);

        return mapper.toDTO(updatedEmployee);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        return service.deleteEmployee(id);
    }
}