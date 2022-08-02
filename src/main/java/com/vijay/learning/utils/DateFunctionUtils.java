package com.vijay.learning.utils;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Slf4j
public class DateFunctionUtils {

    public static void printDateTimeWithoutZone() {
        ZonedDateTime zonedDateTimeNow = Instant.now().atZone(ZoneId.systemDefault());
        String dateTime = zonedDateTimeNow.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        log.info("DateTime with ms: " + dateTime);
    }

    public static void printDateTime(String formatter) {
        ZonedDateTime zonedDateTimeNow = Instant.now().atZone(ZoneId.systemDefault());
        String dateTime = zonedDateTimeNow.format(DateTimeFormatter.ofPattern(formatter));
        log.info("DateTime without Zone: " + dateTime);
    }

    public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
        LocalDateTime localDateTime = dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        log.info("localDateTime: "+ localDateTime);
        return localDateTime;
    }
    public static LocalDateTime convertToLocalDateTime(String strDate){
        return LocalDateTime.parse(strDate);
    }
    public static void compareLocalDateTime(Date date, LocalDateTime localDateTime) {
        LocalDateTime localDateTime1 = convertToLocalDateTime(date);
        log.info("Is DateOne Equals DateTwo: " + localDateTime1.isEqual(localDateTime));
        log.info("Is DateOne before DateTwo: " + localDateTime1.isBefore(localDateTime));
        log.info("Is DateOne after DateTwo: " + localDateTime1.isAfter(localDateTime));
    }
}
