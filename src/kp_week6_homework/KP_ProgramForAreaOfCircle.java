package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_ProgramForAreaOfCircle {
    /*
    6. Write a program to enter any radius value of the circle and find out the
    area.(Formula of Area A=PI*r*r).
     */

    static double PI = 22.0/7.0;
    static double r;
    static String m = ("Enter radius: ");
    static double Area;

    public static void main(String [] args){

        areaOfCircle();

    }

    public static void areaOfCircle(){

        Scanner scn = new Scanner(System.in);
        System.out.println(m);
        r= scn.nextDouble();
        Area=PI*r*r;

        System.out.println("Area of given Radius is: " + Area);

        scn.close();

    }
}
