package com.vijay.learning.overloading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OverLoadMain {
    public static void main(String[] args) {
        method(5);
    }

    public static void method(long number) {
        log.info("long number: {}", number);
    }

    public static void method(int number) {
        log.info("Integer number: {}", number);
    }

    public static void method(int[] numbers) {
        log.info("array number: {}", numbers);
    }
}
