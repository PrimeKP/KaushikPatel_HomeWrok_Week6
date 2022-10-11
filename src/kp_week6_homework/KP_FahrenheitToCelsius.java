package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_FahrenheitToCelsius {

    /*
    7. Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    double F;
    int con1=32;
    double con2=5.0/9.0;
    double celsius;
    String m = "Enter Fahrenheit here: ";

    public static void main(String [] args){

        celsius();

    }

    public static void celsius(){

        Scanner scn = new Scanner(System.in);
        KP_FahrenheitToCelsius obj = new KP_FahrenheitToCelsius();
        System.out.println(obj.m);
        obj.F=scn.nextDouble();
        obj.celsius=((obj.F- obj.con1)* obj.con2);

        System.out.println("Temprature in Celsius is: " + obj.celsius);

        scn.close();

    }


}

