package com.company;

import java.util.ArrayList;

public class Main {
    public static long thirt(long n){
        long[] div ={1,10,9,12,3,4};
        ArrayList<Long> nums = new ArrayList<>();
        int i = 0;
        long prev=0;
        for(;;) {
            if (prev == n) { return n;
            } else {
                prev = n;
                while (n != 0) {
                    if (i >= div.length) {
                        i = 0;
                        continue;
                    }
                    long temp=(n % 10)*div[i];
                    ++i;
                    nums.add(temp);
                    n=n/10;
                }
                i=0;
                n = nums.stream().mapToLong(s -> (long) Float.parseFloat(String.valueOf(s))).sum();
                nums.clear();
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(thirt(85299258));
        }
    }

