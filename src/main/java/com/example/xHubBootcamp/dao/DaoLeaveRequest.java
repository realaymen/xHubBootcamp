package com.example.xHubBootcamp.dao;

import com.example.xHubBootcamp.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoLeaveRequest extends JpaRepository<LeaveRequest,Long> {
}
