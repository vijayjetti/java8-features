package com.vijay.learning.stream;

import com.vijay.learning.enums.Fruits;
import lombok.extern.slf4j.Slf4j;

import static com.vijay.learning.stream.StreamOperations.*;

@Slf4j
public class StreamStringMain {
    public static void main(String[] args) {
        String strNames = "Vijay Chaarvi Chaithu Harika Lakshmi Harini";
        log.info("reversed string names: {}", reverseWords(strNames));
        log.info("Add char to in between String: {}", addCharToString("Gees for Geeks", 'k', 3));
        log.info("Interpolation: {}", interpolation("Geeks for Geeks", "Data Structures"));
        log.info("Print in multiple lines: {}", printSeparateLines("I am Learning", "Micro Services"));
        //iterateCharacters("Geeks for geeks");
        log.info("Is String having special Chars: {}", isHavingSpecialChars("helloJava"));


    }
}
