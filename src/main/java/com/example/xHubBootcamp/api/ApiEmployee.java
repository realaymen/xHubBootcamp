package com.example.xHubBootcamp.api;


import com.example.xHubBootcamp.dto.DtoEmployee;
import com.example.xHubBootcamp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("api/employee")
public class ApiEmployee {
    @Autowired
    private final EmployeeService employeeService;

    public ApiEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("hello")
    public String HelloWorld() {
        return "HelloWorld!!";
    }
    @GetMapping("all")
    public ResponseEntity<List<DtoEmployee>> getAllEmployees() {
        List<DtoEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
    @PostMapping("add")
    public ResponseEntity<DtoEmployee> addEmployee(@RequestBody DtoEmployee dtoEmployee) {
        DtoEmployee createdEmployee = employeeService.addEmployee(dtoEmployee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @PutMapping("update")
    public ResponseEntity<DtoEmployee> updateEmployee(@RequestBody DtoEmployee dtoEmployee) {
        DtoEmployee updatedEmployee = employeeService.updateEmployee(dtoEmployee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

}
