package com.example.xHubBootcamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String picture;
        private String firstname;
        private String lastName;
        private String username;
        private String email;
        private Integer age;
        private Gender gender;
        private Date birthdayDate;
        private String phone;
        private String address;
        private String bio;
        private String job;
        @OneToMany(mappedBy = "employee")
        private List<LeaveRequest> leaveRequests;
}


