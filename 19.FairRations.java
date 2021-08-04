package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> B = Arrays.asList(1,2);
        int count = 0;
        String result = "Yes";

        for(int i=0;i<B.size();i++) {
            if(B.get(i) % 2 == 1 && i != (B.size()-1)) {
                B.set(i, B.get(i)+1);
                B.set(i+1, B.get(i+1)+1);
                count = count + 2;
            }
            if(B.get(i) % 2 == 1 && i == (B.size()-1)) {
                result = "No";
                break;
            }

            System.out.println(B);
        }
        if(result == "No") {
            System.out.println(result);
        }
        else {
            String newCount = Integer.toString(count);
            System.out.println(newCount);
        }


    }





}
