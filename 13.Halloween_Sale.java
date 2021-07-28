package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 80;

        int totalPrice = 0;
        int price = p;
        int count = 0;

        while(totalPrice <= s) {
            totalPrice = totalPrice + price;
            count++;
            if(price >= m+d) {
                price = price - d;
            }

            else {
                price = m;
            }
            System.out.println(totalPrice+" "+ price);
        }

        int result = count;
        if(totalPrice > s) {
            result = count - 1;
        }
        System.out.println(count);
        System.out.println(s);
        System.out.println(result);

    }





}
