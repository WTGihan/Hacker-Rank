package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int station[] = new int[m];

        ArrayList<Integer> result = new ArrayList<Integer>();


        for(int i = 0; i<m; i++) {
            station[i] = input.nextInt();
        }


        for(int i=0;i<n;i++) {
            int distance = n;
            for(int j=0;j<station.length;j++) {
                int stationSpace = station[j];
                if(stationSpace == i) {
                    distance = 0;
                    break;
                }
                else {
                    int newValue = Math.abs(stationSpace - i);
                    if(distance > newValue) {
                        distance = newValue;
                    }
                }
            }
            result.add(distance);
        }

        int maxDistance = Collections.max(result);

        System.out.println(n);
        System.out.println(m);
        System.out.println(result);
        System.out.println(maxDistance);

    }

}
