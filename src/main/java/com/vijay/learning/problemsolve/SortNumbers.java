package com.vijay.learning.problemsolve;

public class SortNumbers {
    public static void main(String[] args) {
        /*
        Given an array of positive and negative numbers, arrange them such that all negative integers appear before all
the positive integers in the array without using any additional data structure like hash table, arrays, etc.
The order of appearance should be maintained.

Input: [12 11 -13 -5 6 -7 5 -3 -6]
Output: [-13 -5 -7 -3 -6 12 11 6 5]
         */
        int[] array = {12, 11, -13, -5, 6 -7, 5, -3, -6};
        for(int i=0; i<= array.length-1; i++){
            int temp;
            int current;
           if(array[i]<0){
               /*temp = array[i];
               array[i]= array[i-1];
               current = temp;*/
               array[0] = array[i];
           }
        }
    }
}
