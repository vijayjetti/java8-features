package com.vijay.learning.utils;

import com.vijay.learning.functionalinterface.Employee;

import java.util.*;

public class SortingUtils {
    public static void sortNumbers(List<Integer> numbers) {
        //  Ascending Order
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Ascending Order: " + numbers);
        //  Descending Order
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }

    public static void sortEmp(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getId));
        System.out.println("Employees Sorted By Id: " + employees);

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Employees Sorted By Name: " + employees);

        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
        System.out.println("Employees Sort by Name and Id: " + employees);
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getId).reversed());
        System.out.println("Employees Sort by Name and Id Reversed: " + employees);
    }
    public static void setReverse() {
//        Set<Integer> numbers = new TreeSet<Integer>(Comparator.reverseOrder());
        Set<Integer> numbers = new TreeSet<>((n1, n2) -> n2.compareTo(n1));
        numbers.addAll(Arrays.asList(5,6,12,19,1,6,7,20));
        System.out.println(numbers);
    }


}
