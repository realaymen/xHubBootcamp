package com.example.xHubBootcamp.service;

import com.example.xHubBootcamp.dao.DaoEmployee;
import com.example.xHubBootcamp.dto.DtoEmployee;
import com.example.xHubBootcamp.entity.Employee;
import com.example.xHubBootcamp.exception.EmployeeNotFoundException;
import com.example.xHubBootcamp.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImpEmployeeService implements EmployeeService{

    @Autowired
    private final DaoEmployee daoEmployee;
    @Autowired
    private final EmployeeMapper employeeMapper;

    public ImpEmployeeService(DaoEmployee daoEmployee, EmployeeMapper employeeMapper) {
        this.daoEmployee = daoEmployee;
        this.employeeMapper = employeeMapper;
    }
  @Override
    public List<DtoEmployee> getAllEmployees() {
        List<Employee> employees = daoEmployee.findAll();
        return employees.stream()
                .map(employeeMapper::EmployeeToDtoEmployee)
                .collect(Collectors.toList());
    }

    @Override
    public DtoEmployee getEmployeeById(Long customerId) {
        Optional<Employee> employee = daoEmployee.findById(customerId);
        return employee.map(employeeMapper::EmployeeToDtoEmployee)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + customerId));
    }


    @Override
    public DtoEmployee addEmployee(DtoEmployee dtoEmployee) {
            Employee employee = employeeMapper.DtoEmployeeToEmployee(dtoEmployee);
            Employee savedEmployee = daoEmployee.save(employee);
            return employeeMapper.EmployeeToDtoEmployee(savedEmployee);
    }

    @Override
    public DtoEmployee updateEmployee(DtoEmployee dtoEmployee) {
        Employee employee = employeeMapper.DtoEmployeeToEmployee(dtoEmployee);
        Employee updatedEmployee = daoEmployee.save(employee);
        return employeeMapper.EmployeeToDtoEmployee(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long customerId) {
        Employee employee = daoEmployee.findById(customerId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with customerId: " + customerId));

        daoEmployee.delete(employee);
    }



}
