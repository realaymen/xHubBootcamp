package com.example.xHubBootcamp.service;

import com.example.xHubBootcamp.dto.DtoEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<DtoEmployee> getAllEmployees();

    DtoEmployee getEmployeeById(Long id);

    DtoEmployee addEmployee(DtoEmployee dtoEmployee);

    DtoEmployee updateEmployee(DtoEmployee dtoEmployee);

    void deleteEmployee(Long customerId);


}
