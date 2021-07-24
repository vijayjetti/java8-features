package com.vijay.learning.utils;

import com.vijay.learning.model.Address;
import com.vijay.learning.model.Customer;
import com.vijay.learning.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class ApplicationUtils {

    public static Address buildAddress(String street, String city, String state, Integer pin) {
        return Address.builder().street(street).city(city).state(state).pin(pin).build();
    }

    public static Customer buildCustomer(Integer id, String name, Integer age, List<Address> addressList) {
        return Customer.builder().id(id).name(name).age(age).addresses(addressList).build();
    }
    public static Employee buildEmployee(Integer id, String name, Integer age, String gender, String department, Integer yearOfJoining, BigDecimal salary){
        return Employee.builder().id(id).name(name).age(age).gender(gender).department(department).yearOfJoining(yearOfJoining).salary(salary).build();
    }
}
