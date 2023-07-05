package com.example.xHubBootcamp.api;


import com.example.xHubBootcamp.entity.Employee;
import com.example.xHubBootcamp.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("api/employee")
public class ApiEmployee {
    private final EmployeeService employeeService;

    public ApiEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("hello")
    public String HelloWorld() {
        return "HelloWorld!!";
    }
    @GetMapping("all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PostMapping("add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok(createdEmployee);
    }

}
