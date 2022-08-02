package com.vijay.learning.datefunctions;

import java.util.Date;

import static com.vijay.learning.utils.DateFunctionUtils.*;

public class DateFunctionsMain {
    public static void main(String[] args) {
        printDateTimeWithoutZone();
        printDateTime("yyyy-MM-dd'T'HH:mm:ss");
        convertToLocalDateTime(new Date());
        compareLocalDateTime(new Date(), convertToLocalDateTime("2022-08-05T11:50:55"));
    }
}
