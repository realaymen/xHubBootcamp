package com.example.xHubBootcamp.service;

import com.example.xHubBootcamp.dao.DaoLeaveRequest;
import com.example.xHubBootcamp.entity.Employee;
import com.example.xHubBootcamp.entity.LeaveRequest;

import java.util.List;

public class ImpLeaveRequestService implements LeaveRequestService{


    private final DaoLeaveRequest daoLeaveRequest;

    public ImpLeaveRequestService(DaoLeaveRequest daoLeaveRequest) {
        this.daoLeaveRequest = daoLeaveRequest;
    }


    @Override
    public List<LeaveRequest> getAllLeaveRequest() {
      return daoLeaveRequest.findAll();

    }

    @Override
    public LeaveRequest getAllLeaveRequestById(Long id) {
        return null;
    }
    @Override
    public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest) {
       return daoLeaveRequest.save(leaveRequest);
    }

    @Override
    public LeaveRequest updateLeaveRequest(Long id, LeaveRequest leaveRequest) {
        return null;
    }

    @Override
    public void deleteLeaveRequest(Long id) {

    }
}
