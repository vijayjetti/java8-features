package com.vijay.learning.stream;

import com.vijay.learning.model.Address;
import com.vijay.learning.model.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

import static com.vijay.learning.stream.StreamOperations.*;
import static com.vijay.learning.utils.ApplicationUtils.buildAddress;
import static com.vijay.learning.utils.ApplicationUtils.buildCustomer;

@Slf4j
public class StreamMain {
    public static void main(String[] args) {

        Address address1 = buildAddress("Ayyappa Nagar1", "Bangalore", "Karnataka", 560036);
        Address address2 = buildAddress("Ayyappa Nagar2", "Mysore", "Karnataka", 560037);
        Address address3 = buildAddress("Ayyappa Nagar3", "Mumbai", "Maharastra", 560038);
        Address address4 = buildAddress("Ayyappa Nagar4", "Chennai", "Tamilnadu", 560043);
        Address address5 = buildAddress("Ayyappa Nagar5", "Delhi", "Delhi", 560059);
        List<Address> addressList = Arrays.asList(address1, address2, address3, address4, address5);

        Customer customer6 = buildCustomer(10006, "Vijay", 30, addressList);
        Customer customer1 = buildCustomer(10001, "Vijay", 29, addressList);
        Customer customer2 = buildCustomer(10002, "Katrina", 23, Collections.singletonList(address2));
        Customer customer3 = buildCustomer(10004, "Rashmika", 29, Collections.singletonList(address1));
        Customer customer4 = buildCustomer(10004, "Rashmika", 29, Collections.singletonList(address2));
        Customer customer5 = buildCustomer(10005, "Rakhul", 17, addressList);
        List<Customer> customers = Arrays.asList(customer1, customer2, customer5, customer6, customer4, customer3);

        List<String> names = Arrays.asList("Vijay", "Lakshmi", "Harika", "Harini", "Lathika", "Chaarvi", "Vinay", "Chaarvi");
        String strNames = "Vijay|Lakshmi|Harika|Harini|Lathika|Chaarvi|Vinay|Chaarvi";
        String strFilter = "areaType.id:County;State;City;Mandal;Street,provider.id:Airtel;Jio;Hathway;ACT";
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Vijay");
        map.put(2, "Charvi");
        map.put(3, "Harini");
        map.put(4, "Harika");
        map.put(7, "Vij@y");
        map.put(6, "Naga1234");
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 1, 1);

        log.info("Unique Customers: {} ", getUnique(customers));
        log.info("Unique Customers size: {} ", getUnique(customers).size());
        log.info("Young Customer Names: {}", getYoungCustomers(customers));
        log.info("Count Young Customers: {}", getYoungCustomerCount(customers));
        log.info("Any Customer with Vijay: {}", getAnyCustWithNameMatch(customers, "Vijay"));
        log.info("Any Customer with Charvi: {}", getAnyCustWithNameMatch(customers, "Charvi"));
        arithMeticOperations(customers);
        log.info("Sort By Name and ID: {}", sortByNameAndId(customers));
        log.info("Customer Names: {}", getNamesPipeSeparate(customers));
        groupByCustomer(customers).forEach((name, empList) -> log.info("Group By Customer Name: {} => {}", name, empList.size()));
        log.info("Set of PinCodes: {}", getPincodes(customers));
        log.info("Convert List to | String: {}", convertToString(names, "|"));
        // String with | separator won't work, Investigate Why
        log.info("Convert | String to List {}", convertToList(strNames, "\\|"));
        log.info("Convert | String to List Size: {}", convertToList(strNames, "\\|").size());
        log.info("Sort Names: {}", sortNames(names));
        log.info("Sort Names Descending: {}", sortNamesDescending(names));
        log.info("Limit Names first 5 names: {}", limitNames(names, 5));
        log.info("Skip Names first 3 names in list: {}", skipNames(names, 3));
        log.info("Filter Map: {}", getFilterMap(strFilter, ",", ":", ";"));
        log.info("Only Alphabet values in Map: {}", getAlphabeticValueMap(map));
        log.info("Sum of Squares numbers: {}", (int) getSquareSum(numbers));
        log.info("Find Frequency: {}", findFrequency(numbers));
        log.info("Find max number: {}", findMaxNumber(numbers));
        findMostDuplicate(Arrays.asList(1, 3, 7, 1, 4, -3, -7, -7, 8, 9, 1, 5, 5, 7));

    }
}
