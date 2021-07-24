package com.vijay.learning.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class StreamArrayOperations {


    public static boolean matchValue(double[] doubleArray, int target) {
        /**
         IntStream, LongStream also can be used for respective types
         **/
        return DoubleStream.of(doubleArray).anyMatch(number -> number == target);
    }

    public static boolean matchValue(String[] array, String target) {
        return Arrays.stream(array).anyMatch(target::equals);
    }

    public static <T> boolean matchValueAnyType(T[] array, T target) {
        return Arrays.stream(array).anyMatch(target::equals);
    }
    public String[] reverse(String ... strArray){
       return strArray;
    }
}
