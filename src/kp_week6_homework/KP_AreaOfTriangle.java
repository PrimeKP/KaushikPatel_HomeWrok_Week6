package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_AreaOfTriangle {

    /*
    8. Write a program to calculate the area of a triangle.
     */

    double base;
    double height;
    double at;
    int c=2;
    String m1 = "Enter Base of Triangle: ";
    String m2 = "Enter Height of Triangle: ";

    public static void main(String [] args){

        KP_AreaOfTriangle obj = new KP_AreaOfTriangle();
        obj.areaOfTriangle();

    }

    public void areaOfTriangle(){

        Scanner scn = new Scanner(System.in);
        System.out.println(m1);
        base= scn.nextDouble();
        System.out.println(m2);
        height=scn.nextDouble();

        at=(base*height)/2;

        System.out.println("Area of Triangle is: " + at);

        scn.close();

    }
}
