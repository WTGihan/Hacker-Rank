package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int n = 6;
        int c = 2;
        int m = 2;

        int items = n/c;
        int count = items;

        while(count >= m) {
            count = (count - m) + 1;
            items = items + 1;
            System.out.println(items);
        }

        System.out.println(items);


    }





}
