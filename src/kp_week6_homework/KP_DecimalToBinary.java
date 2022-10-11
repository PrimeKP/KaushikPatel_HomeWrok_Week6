package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_DecimalToBinary {

    /*17. Write a Java program to convert a decimal number to binary number.
    Input Data:
    Input a Decimal Number : 5
    Expected Output
    Binary number is: 101
    */

    public static void main (String [] args){

        decimalToBinary();
    }

    public static void decimalToBinary(){
        int x;
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        x=scn.nextInt();
        String y = Integer.toBinaryString(x);
        System.out.println("Expected Output");
        System.out.println("Binary number is :" + y);
        scn.close();
    }


}
