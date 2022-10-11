package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_ProgramForCalculator {
    /*
    5. Write a program for a calculator with addition, subtraction, multiplication
    and division methods all with parameters and use string concatenation
    methods.(Note: Two static and Two instance methods.)
     */

    static double x;
    static double y;
    static String o = ("Enter value of x :");
    static String t = ("Enter value of y : ");

    public static void main(String [] args){

        KP_ProgramForCalculator obj = new KP_ProgramForCalculator();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();

    }

    public void addition(){

        Scanner scn = new Scanner(System.in);
        System.out.print(o);
        x = scn.nextDouble();
        System.out.print(t);
        y = scn.nextDouble();
        System.out.println("Sum of x & Y = " + (x+y));

        scn.close();

    }

    public void subtraction(){

        System.out.println("Subtraction of x & Y = " + (x-y));

    }

    public static void multiplication(){

        System.out.println("Multiplication of x & Y = " + (x*y));

    }

    public static void division(){

        System.out.println("Division of x & Y = " + ((x)/(y)));

    }


}



