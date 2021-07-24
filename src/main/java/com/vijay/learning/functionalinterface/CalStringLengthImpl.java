package com.vijay.learning.functionalinterface;

public class CalStringLengthImpl implements CalStringLength {
    @Override
    public int calculateLength(String string) {
        return string.length();
    }
}
