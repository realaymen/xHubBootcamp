package com.example.xHubBootcamp.dao;

import com.example.xHubBootcamp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoEmployee extends JpaRepository<Employee,Long> {
}