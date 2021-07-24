package com.vijay.learning.functionalinterface;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Builder
@Data
public class Employee {
    private Integer id;
    private String name;
}
