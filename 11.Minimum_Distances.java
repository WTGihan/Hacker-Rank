package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int d = 3;
        int count = 0;
        List<Integer> arr=Arrays.asList(1, 2, 3 ,4 ,10);
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = arr.size()-1; i>=0;i--) {
            int num = arr.get(i);
            int position = arr.indexOf(num);
            System.out.println(position +" "+ i);
            if(position != i) {
                int result = i - position;
                results.add(result);
            }
        }
        System.out.println(results);
        int min = 0;
        if(results.size() != 0) {
           min = Collections.min(results);
        }
        else {
           min = -1;
        }

        System.out.println(min);


    }





}
