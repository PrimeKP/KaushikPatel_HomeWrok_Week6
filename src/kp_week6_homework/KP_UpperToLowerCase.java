package kp_week6_homework;

//Kaushik Patel

import java.util.Scanner;

public class KP_UpperToLowerCase {

    /*
    9. Write a program to convert the upper case to lower case.
     */

    public static void main(String [] args){

        upperToLower();

    }

    public static void upperToLower(){
        String s = new String();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String in Upper case: ");
        s = scn.nextLine();
        System.out.println(s.toLowerCase());

        scn.close();

    }

}
