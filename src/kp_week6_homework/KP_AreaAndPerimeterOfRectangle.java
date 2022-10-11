package kp_week6_homework;

import java.text.DecimalFormat;

//Kaushik Patel
public class KP_AreaAndPerimeterOfRectangle {
    /*
    14. Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

    float w = 5.60f;
    float h = 8.50f;
    float area = (w*h);
    float perimeter = 2f*(w+h);

    public static void main (String [] args){
        KP_AreaAndPerimeterOfRectangle obj = new KP_AreaAndPerimeterOfRectangle();
        obj.are();
        obj.perimeter();

    }
    public void are(){
        DecimalFormat two = new DecimalFormat("##.00");
        System.out.println("Area is 5.6 * 8.5 = " + two.format(area));

    }

    public void perimeter(){
        DecimalFormat two = new DecimalFormat("##.00");
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + two.format(perimeter));

    }

}


