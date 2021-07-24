package com.vijay.learning.lambdaexpression;

import com.vijay.learning.functionalinterface.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static com.vijay.learning.utils.SortingUtils.*;

public class LearnLambdaExp {
    public static void main(String[] args) {
        sayHello("Vijay");
        sayHelloLambda("Jetti");
        Employee emp1 = buildEmp(1001, "Vijay");
        Employee emp2 = buildEmp(1002, "Samantha");
        Employee emp3 = buildEmp(1003, "Rashmika");
        Employee emp6 = buildEmp(1006, "Chaarvi");
        Employee emp4 = buildEmp(1004, "Vijay");
        Employee emp5 = buildEmp(1005, "Pavan");
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
        List<Integer> numbers = Arrays.asList(10, 1, 4, 8, 3, 15, 6);
        sortNumbers(numbers);
        sortEmp(employees);
        setReverse();
    }
    public static void sayHello(String name) {
        System.out.println("Hello, Welcome to Learning!!" +name );
    }
    public static void sayHelloLambda(String name) {
        Consumer consumer = test -> System.out.println("Hello Welcome to Lambda Learning !! "+name);
        consumer.accept("Accept Context");
    }
    private static Employee buildEmp(Integer id, String name) {
        return Employee.builder().id(id).name(name).build();
    }
}
