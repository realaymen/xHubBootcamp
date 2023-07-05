package com.example.xHubBootcamp.service;

import com.example.xHubBootcamp.dao.DaoEmployee;
import com.example.xHubBootcamp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpEmployeeService implements EmployeeService{

    private final DaoEmployee daoEmployee;

    public ImpEmployeeService(DaoEmployee daoEmployee) {
        this.daoEmployee = daoEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return daoEmployee.findAll();
    }


    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
            return daoEmployee.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
