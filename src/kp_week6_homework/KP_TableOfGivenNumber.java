package kp_week6_homework;

import java.util.Scanner;

//Kaushik Patel
public class KP_TableOfGivenNumber {
    /*
    10. Write a Java program that takes a number as input and prints its
    multiplication table up to 10.
    Test Data: Input a number: 8
    Expected Output :
    8 x 1 = 8
    8 x 2 = 16
    8 x 3 = 24
    ...
    8 x 10 = 80
     */

    int n;

    public static void main(String [] args){

        KP_TableOfGivenNumber obj = new KP_TableOfGivenNumber();
        obj.table();

    }

    public void table(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter any Whole number: ");
        n= scn.nextInt();
        System.out.println(n + " X " + "01" + " = " + n*1);
        System.out.println(n + " X " + "02" + " = " + n*2);
        System.out.println(n + " X " + "03" + " = " + n*3);
        System.out.println(n + " X " + "04" + " = " + n*4);
        System.out.println(n + " X " + "05" + " = " + n*5);
        System.out.println(n + " X " + "06" + " = " + n*6);
        System.out.println(n + " X " + "07" + " = " + n*7);
        System.out.println(n + " X " + "08" + " = " + n*8);
        System.out.println(n + " X " + "09" + " = " + n*9);
        System.out.println(n + " X " + "10" + " = " + n*10);

        scn.close();
    }
}
