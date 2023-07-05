package com.example.xHubBootcamp.dto;

import com.example.xHubBootcamp.entity.LeaveRequest;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {
    private Long id;
    private String firstname;
    private String lastName;
    private String username;
    private String email;
    private Integer age;
    private String gender;
    private Date birthdayDate;
    private String phone;
    private String address;
    private String job;
    private List<LeaveRequest> leaveRequests;
}
