package com.example.xHubBootcamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "leaveRequests")
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer nbrDay;
    private String reason;
    private String status;
    private String comments;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
