package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_SwapNumber {
    /*
    15. Write a Java program to swap two variables.
     */

    public static void main (String [] args){

        swapNumber();

    }

    public static void swapNumber(){

        int a;
        int b;
        int c;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value A: ");
        a = scn.nextInt();
        System.out.print("Enter Value B: ");
        b = scn.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b );
        c=a;
        a=b;
        b=c;

        System.out.println("Swap Number:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        scn.close();

    }



}

