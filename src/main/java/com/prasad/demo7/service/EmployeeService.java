package com.prasad.demo7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.prasad.demo7.entity.Employee;
import com.prasad.demo7.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Save Employee
    public Employee saveEmployee(Employee employee) {

        // Password Hashing
        String encodedPassword =
                passwordEncoder.encode(employee.getPassword());

        employee.setPassword(encodedPassword);

        return repository.save(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get Employee By Id
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update Employee
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee =
                repository.findById(id).orElse(null);

        if (existingEmployee != null) {

            existingEmployee.setName(employee.getName());
            existingEmployee.setSurname(employee.getSurname());
            existingEmployee.setCity(employee.getCity());
            existingEmployee.setResult(employee.getResult());
            existingEmployee.setEmail(employee.getEmail());

            // Encode Updated Password
            String encodedPassword =
                    passwordEncoder.encode(employee.getPassword());

            existingEmployee.setPassword(encodedPassword);

            return repository.save(existingEmployee);
        }

        return null;
    }

    // Delete Employee
    public String deleteEmployee(Long id) {

        repository.deleteById(id);

        return "Employee Deleted Successfully";
    }
}