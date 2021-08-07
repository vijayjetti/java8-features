package com.vijay.learning.stream;

import com.vijay.learning.model.Employee;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.vijay.learning.stream.StreamOperations.*;
import static com.vijay.learning.utils.ApplicationUtils.buildEmployee;

@Slf4j
public class StreamEmpMain {
    public static void main(String[] args) {
        List<Employee> employees = constructEmployees();
        sortEmployeeByAge(employees);
        log.info("Sort employee descending name : {}", sortEmployeeByName(employees));
        log.info("Employees Count {}", employees.size());
        log.info("Male Employee Count: {}", findEmpCount(employees, "Male"));
        log.info("Female Employee Count: {}", findEmpCount(employees, "Female"));
        log.info("Employee Count by Gender: {}", findEmployeeCountByGender(employees));
        log.info("Find Departments: {}", findAllDepartments(employees));
        log.info("Find Average Age ByGender: {}", findAverageAgeByGender(employees));
        log.info("Get Highest Paid Employee: {}", findHighestPaidEmployee(employees));
        log.info("Employee Names who joined after 2015: {}", getEmpNamesAfter2015(employees));
        log.info("Employee Count Dept wise: {}", getEmpCountInDepartment(employees));
        log.info("Dept wise Avg Salary: {}", getAvgSalaryOfDepartment(employees));
        log.info("Max salary Employee from each Dept: {}", getMaxSalaryEmpOfDepartment(employees));
        log.info("Youngest male employee in the product development department: {}", getDeptYoungestMaleEmp(employees, "Product Development", "Male"));
        log.info("Most Exp Emp: {}", getMostExpEmp(employees));
        log.info("Employee Count by Gender in  Sales And Marketing: {}", getEmpCountByGenderInDept(employees, "Sales And Marketing"));
        log.info("Employee Avg salary by Gender: {}", getAverageSalaryByGender(employees));
        log.info("Employee Name List by Dept: {}", getNameListByDept(employees));
        findSalaryStatics(employees);
        separateYoungEmployees(employees);
        log.info("Oldest Emp : {}", findOldestEmp(employees));
    }

    private static List<Employee> constructEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(buildEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, BigDecimal.valueOf(25000.0)));
        employees.add(buildEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, BigDecimal.valueOf(13500.0)));
        employees.add(buildEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, BigDecimal.valueOf(18000.0)));
        employees.add(buildEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, BigDecimal.valueOf(32500.0)));
        employees.add(buildEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, BigDecimal.valueOf(22700.0)));
        employees.add(buildEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, BigDecimal.valueOf(10500.0)));
        employees.add(buildEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, BigDecimal.valueOf(27000.0)));
        employees.add(buildEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, BigDecimal.valueOf(34500.0)));
        employees.add(buildEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, BigDecimal.valueOf(11500.0)));
        employees.add(buildEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, BigDecimal.valueOf(11000.5)));
        employees.add(buildEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, BigDecimal.valueOf(15700.0)));
        employees.add(buildEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, BigDecimal.valueOf(28200.0)));
        employees.add(buildEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, BigDecimal.valueOf(21300.0)));
        employees.add(buildEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, BigDecimal.valueOf(10700.5)));
        employees.add(buildEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, BigDecimal.valueOf(12700.0)));
        employees.add(buildEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, BigDecimal.valueOf(28900.0)));
        employees.add(buildEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, BigDecimal.valueOf(35700.0)));
        return employees;
    }
}
