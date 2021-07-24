package com.vijay.learning.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(exclude = {"addresses"})
public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private List<Address> addresses;
}
