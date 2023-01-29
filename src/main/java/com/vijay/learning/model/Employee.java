package com.vijay.learning.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Builder
@Data
@EqualsAndHashCode(exclude = {"salary", "yearOfJoining"})
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String department;
    private Integer yearOfJoining;
    private BigDecimal salary;
}
