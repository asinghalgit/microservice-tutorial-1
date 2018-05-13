package com.learn.microservice.EmployeeService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class Employee {
    private final Integer employeeId;
    private final LocalDate joiningDate;
    private final Integer salary;
}
