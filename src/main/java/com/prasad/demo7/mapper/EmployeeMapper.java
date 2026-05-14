package com.prasad.demo7.mapper;

import org.springframework.stereotype.Component;

import com.prasad.demo7.dto.EmployeeDTO;
import com.prasad.demo7.entity.Employee;

@Component
public class EmployeeMapper {

    public EmployeeDTO toDTO(Employee employee) {

        EmployeeDTO dto = new EmployeeDTO();

        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setSurname(employee.getSurname());
        dto.setCity(employee.getCity());
        dto.setResult(employee.getResult());
        dto.setEmail(employee.getEmail());

        return dto;
    }
}
