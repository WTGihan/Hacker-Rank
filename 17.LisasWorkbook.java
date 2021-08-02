package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int n = 5;
        int k = 3;
        List<Integer> arr = Arrays.asList(4,2,6,1,10);

        int page = 1;
        int specialPageCount = 0;
        int count = 0;

        for(int i =0;i<n;i++) {
            int num = arr.get(i);
            for(int j=1;j<=num;j++) {
                page = page + count;
                if(j%k==0 && j!=num) {
                    count = 1;
                }
                else {
                    count = 0;
                }

                if(page == j) {
                    specialPageCount = specialPageCount + 1;
                }
                System.out.println(j+" : "+page+" : "+specialPageCount);
            }
            page = page + 1;

        }
        System.out.println(specialPageCount);

    }

}
