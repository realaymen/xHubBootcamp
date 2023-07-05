package com.example.xHubBootcamp.service;

import com.example.xHubBootcamp.entity.Employee;
import com.example.xHubBootcamp.entity.LeaveRequest;

import java.util.List;

    public interface LeaveRequestService {
    List<LeaveRequest> getAllLeaveRequest();
    LeaveRequest getAllLeaveRequestById(Long id);
    LeaveRequest addLeaveRequest(LeaveRequest leaveRequest);

    LeaveRequest updateLeaveRequest(Long id, LeaveRequest leaveRequest);
    void deleteLeaveRequest(Long id);
}
