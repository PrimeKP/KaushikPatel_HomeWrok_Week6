package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_BinarySum {
    /*
    16. Write a Java program to add two binary numbers.
    Input Data:
    Input first binary number: 10
    Input second binary number: 11
    Expected Output:
    Sum of two binary numbers: 101
     */

    public static void main(String[] args) {

        toBinary();

    }

    public static void toBinary() {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String x = scn.next();
        System.out.print("Input second binary number :");
        String y = scn.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1+n2;

        System.out.println("Binary No. One " + Integer.toBinaryString(n1));
        System.out.println("Binary No. Two " + Integer.toBinaryString(n2));
        System.out.println("Sum of two binary numbers: "+Integer.toBinaryString(n3));

        scn.close();
    }


}
