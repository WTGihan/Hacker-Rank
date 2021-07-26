package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int d = 3;
        int count = 0;
        List<Integer> arr=Arrays.asList(1, 2, 4, 5, 7, 8, 10);
        for(int i = 0; i<arr.size();i++) {
            int num = arr.get(i) + d;
            boolean result = arr.contains(num);
            if(result == true) {
                int num1 = num + d;
                boolean result1 = arr.contains(num1);
                if(result1 == true) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }





}