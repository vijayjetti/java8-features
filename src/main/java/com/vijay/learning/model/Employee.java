package com.vijay.learning.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String department;
    private Integer yearOfJoining;
    private BigDecimal salary;
}
