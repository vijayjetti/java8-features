package com.vijay.learning.problemsolve;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

import static com.vijay.learning.problemsolve.ProblemSolvingUtils.*;

@Slf4j
public class ProblemSolve {
    public static void main(String[] args) {
        log.info("Fibonacci Count: {}", fibonacci(6));
        log.info("Get Fibonacci Series: {}", getFibonacciSeries(6));
        log.info("Is prime: {}", isPrime(17));
        log.info("Get Prime numbers : {}", getPrimeNumbers(100));
        log.info("Is Efficient Palindrome : {}", isEfficientPalindrome("VIJAYAYABJIV"));
        log.info("Is Efficient Palindrome : {}", isEfficientPalindrome("ANNa"));
        log.info("Is Efficient Palindrome : {}", isEfficientPalindrome("A"));
        log.info("Is Palindrome : {}", isPalindrome("VIJAYA Jetti itteJ AYAJIV"));
        log.info("Is Number Palindrome : {}", isPalindrome(123213));
        log.info("Is Armstrong : {}", isArmstrong(153));
        log.info("get Armstrong : {}", getArmStrongNumbers(1000));
        log.info("Find Factorial: {}", findFactorial(5));
        log.info("remove Duplicate: {}", removeDuplicate(new int[]{4, 5, 5, 6, 4, 3, 2, 0, 1, 2, 3}));
        log.info("find Duplicate: {}", findDuplicateChars("Programming"));
        log.info("find Duplicate: {}", findDuplicateNumbers(Arrays.asList(1, 3, 1, 5, 6, 3, 6, 9, 2, 6, 7, 1)));
        log.info("find Two Sum positions:{} ", findTwoSum(new int[]{2, 7, 11, 15, 6, 3, 5, 4, 7}, 9));
        log.info("is Anagram words: {}", isAnagram("Silent", "Listen"));
        log.info("is Anagram words: {}", isAnagram("The Eyes", "They see "));
        log.info("is Armstrong Number: {}", isArmStrongNumber(153));
        log.info("is Armstrong Number: {}", isArmStrongNumber(1));
        log.info("is Armstrong Number: {}", isArmStrongNumber(30));
        log.info("is Armstrong Number: {}", isArmStrongNumber(407));
        log.info("findFirstNonRepeatedCharacter: {}", findFirstNonRepeatedCharacter("analogy"));
        /*log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome(""));
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("abab"));
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("abcbac"));
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("naman"));*/
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("ntiin"));
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("ntiin"));
        log.info("Minimum Swap Count for Palindrome {}", swapCountForPalindrome("ntiin"));
        int[] array = {1, 2, 3, 4};
        log.info("Alt Tab: {}", altTab(4, 3, array));

        int[] array2 = {4, 1, 3, 7, 6, 8, 5, 2, 10, 9};
        log.info("Alt Tab: {}", altTab(10, 7, array2));
        swapStrings("Vijay", "Jetti");
        swapStrings("Sai", "Krishna");
        // Will give compile time error due to ambiguity of char[] or  string
        //System.out.println(null);

        //addZeroAfterTwoNumbers(10);

    }
}
