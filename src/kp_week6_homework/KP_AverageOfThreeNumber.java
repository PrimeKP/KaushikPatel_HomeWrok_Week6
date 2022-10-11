package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_AverageOfThreeNumber {
    /*
    13. Write a Java program that takes three numbers as input to calculate and
    print the average of the numbers.
     */

    double a;
    double b;
    double c;

    public static void main(String [] args){

        average();

    }

    public static void average(){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double a=scn.nextInt();
        System.out.print("Enter Second Number: ");
        double b=scn.nextInt();
        System.out.print("Enter Third Number: ");
        double c=scn.nextInt();

        System.out.println("Average of Given Numbers is: " + avr(a, b, c));
        scn.close();
    }
    public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
