package com.vijay.learning.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InheritanceMain {
    public static void main(String[] args) {
        Super reference = new Sub();
        log.info(reference.name);
    }
}
