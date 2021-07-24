package com.vijay.learning.stream;

import lombok.extern.slf4j.Slf4j;

import static com.vijay.learning.stream.StreamArrayOperations.matchValue;
import static com.vijay.learning.stream.StreamArrayOperations.matchValueAnyType;

@Slf4j
public class StreamArrayMain {

    public static double[] DOUBLE_ARRAY = new double[]{1, 2, 3, 4, 5, 7, 6, 8, 10, 9};

    public static void main(String[] args) {
       log.info("Double Array: {}", matchValue(DOUBLE_ARRAY, 5));
        String[] array = {"Vijay", "Rashmika", "Ruchika"};
        Integer[] intArray = {1, 5, 4, 6, 9, 3};
        log.info("Match value {}", matchValue(array, "Harini"));
        log.info("matchValueAnyType {}", matchValueAnyType(intArray, 6));
    }

}
