package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_MultiOperations {

    /*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.
    Test Data:
    Input first number: 125
    Input second number: 24
    Expected Output :
    125 + 24 = 149
    125 - 24 = 101
    125 x 24 = 3000
    125 / 24 = 5
    125 mod 24 = 5
     */

    public static void main(String [] args){

        KP_MultiOperations obj = new KP_MultiOperations();
        obj.operations();

    }
    public void operations(){
        int x;
        int y;
        Scanner scn = new Scanner(System.in);
        System.out.print("Input first number: ");
        x=scn.nextInt();
        System.out.print("Input second number: ");
        y= scn.nextInt();
        System.out.println("Expected Output:");
        int a=x+y;
        System.out.println(x + " + " + y + " = " + (a));
        int b=x-y;
        System.out.println(x + " - " + y + " = " + (b));
        int c=x*y;
        System.out.println(x + " x " + y + " = " + (c));
        int d=x/y;
        System.out.println(x + " / " + y + " = " + (d));
        int e=x%y;
        System.out.println(x + " mod " + y + " = " + (e));

        scn.close();


    }

}

