package com.spbu.pack_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Control structures
        int a = 0;
        int b = 1;

        Arrays.asList(1,3,4);

        if (a > b) {
            System.out.println("a > b");
        } else  if(b + a == 100){
            System.out.println("b < a");
        } else {
            System.currentTimeMillis();
        }

        printDashed();

        double low = 0.0;
        double high = 1.0;
        double x = -1.0;

        //logic operands
        if (low <= x && x <= high) {
            System.out.println("in range");
        } else {
            System.out.println("out of range");
        }

        printDashed();
        // S W I T C H / C A S E
        int n = 10;
        switch (n) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("something else");
        }// end switch (n)

        printDashed();

        // F O R  used when you know the
        // maximum number of times to iterate in advance.
        // Note lack of; after i++0
        printDashed();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // F O R to step through each char of a String, left to right
        // Avoids recomputing s.length. Avoids defining n outside the loop.
        // Note you must use a comma before n, not a semicolon.
        // You may not say int n= or final int n=.
        String s = "Hey you!";
        for (int i = 0, l = s.length(); i < l; i++) {
            System.out.println(s.charAt(i));
        }
        printDashed();
        for(char c: s.toCharArray()){
            System.out.println(c);
        }
        printDashed();
        // R E V E R S E   F O R  to countdown
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }

        printDashed();

        // A R R A Y - S P A N N I N G   F O R
        String[] stuff = new String[ 10 ];
        for ( int i=0; i<n; i++ )
        {
            s = stuff[i];
            System.out.println( s );
        }

    }


    private static String getDashes(int n){
        StringBuilder dashes = new StringBuilder();
        for (int i = 0; i < n; i++){
            dashes.append("-");
        }
        return dashes.toString();
    }

    private static final int DEFAULT_DASHES = 10;

    private static String getDashes(){
        return getDashes(DEFAULT_DASHES);
    }

    private static void printDashed(){
        System.out.println(getDashes());
    }

}

