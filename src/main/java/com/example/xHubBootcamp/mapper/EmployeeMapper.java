package com.example.xHubBootcamp.mapper;


import com.example.xHubBootcamp.dto.DtoEmployee;
import com.example.xHubBootcamp.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
        @Mapping(source = "id", target = "customerId")
        DtoEmployee EmployeeToDtoEmployee(Employee employee);
        @InheritInverseConfiguration
        Employee DtoEmployeeToEmployee(DtoEmployee dtoEmployee);
        void updateEmployeeFromDtoEmployee(DtoEmployee dtoEmployee, @MappingTarget Employee employee);


}
