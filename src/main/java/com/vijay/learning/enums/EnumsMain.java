package com.vijay.learning.enums;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.vijay.learning.enums.EnumUtils.convertEnumToString;

@Slf4j
public class EnumsMain {
    public static void main(String[] args) {
        log.info("Convert Enum to String: {}", convertEnumToString(Fruits.Orange));
        Arrays.stream(Fruits.values()).forEach(fruit -> log.info(fruit.name()));
        log.info("Enum to List: {}", Arrays.stream(Fruits.values()).collect(Collectors.toList()));
        log.info("Ordinal or Position: {}", Fruits.Apple.ordinal());
        log.info("Ordinal or Position: {}", Fruits.Orange.ordinal());
        // enum compareTo will compare the ordinal (Position) value
        log.info("Compare of Enum Constants: {}", Fruits.Apple.compareTo(Fruits.Orange));
    }
}
