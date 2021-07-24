package com.vijay.learning.enums;

import java.util.List;

public class EnumUtils {

    public static String convertEnumToString(Enum<Fruits> fruitsEnum) {
        // Using toString
        //return fruitsEnum.toString();
        // Using name
        return fruitsEnum.name();
    }
}
