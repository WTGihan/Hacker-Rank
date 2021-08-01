package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int n = 8;

        List<List<Integer>> cases = Arrays.asList(
                Arrays.asList(8,5), Arrays.asList(2,3,1,2,3,2,3,3),
                Arrays.asList(0,3),
                Arrays.asList(4,6),
                Arrays.asList(6,7),
                Arrays.asList(3,5),
                Arrays.asList(0,7)
                );

        List<Integer> width = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        width = cases.get(1);

        for(int i = 2; i < cases.size(); i++ ) {
            int locateOne = cases.get(i).get(0);
            int locateSecond = cases.get(i).get(1);

            int min = width.get(locateOne);
            for(int j= locateOne+1; j<=locateSecond; j++) {
                int value = width.get(j);
                if(value < min) {
                    min = value;
                }
            }
            result.add(min);
        }


        System.out.println(result);

    }





}
