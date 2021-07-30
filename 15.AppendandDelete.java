package com.wtgihan;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        String s = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        String t = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        int k = 20;

        int length = 0;
        int out = 0;
        int countDelete = 0;
        int countAppend = 0;

        if(s.length() < t.length()) {
            length = s.length();
        }
        else {
            length = t.length();
        }
        System.out.println(length);
        for(int i = 0; i < length; i++) {
//            System.out.println(i);
            if(s.charAt(i) != t.charAt(i)) {
                out = i - 1;
                break;
            }
            else {
                out = i;
            }
        }

        System.out.println(out);
        if(out < s.length() -1) {
            countDelete = s.length() - 1 - out;
            countAppend = t.length() - 1 - out;
        }
        if(out == s.length() - 1) {
            if(s.length() < t.length()) {
                if(out == k) {
                    countAppend = t.length() - 1 - out;
                }
                else {
                    countDelete = s.length() + 1;
                    countAppend = t.length();
                }

            }
            else {

                if(out < k) {
                    countDelete = s.length() + 1;
                    countAppend = t.length();
                }
                else {
                    countAppend = 2*k - 3;
                    countDelete = 3 - k;
                }
            }

        }


        int count = countAppend + countDelete;
        System.out.println(count);


        String result = "";
        if(k >= count){
            result = "Yes";
        }
        else {
            result = "No";
        }


        System.out.println(result);


    }





}


