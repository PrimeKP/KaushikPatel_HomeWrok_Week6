package kp_week6_homework;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Kaushik Patel
public class KP_PrintReceipt {

    public static void main(String[] args) {
        printAReceipt();
    }

    public static void printAReceipt() {

        float gallonf;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Gallons: ");
        gallonf = scn.nextFloat();

        double price = 2.089;
        System.out.println("Price/Gallon: $ " + price);

        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm");
        String formatedDate = myDateObj.format(myFormatObj);

        System.out.println("\"|   " + formatedDate + "   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|" + "  Gallons:      " + new DecimalFormat("00.000").format(gallonf) + "  |\"");
        System.out.println("\"|" + "  Price/Gallon: $" + price + "  |\"");
        System.out.println("\"|                        |\"");
        double total = gallonf * price;
        System.out.println("\"|" + "  Fuel Total: $ " + new DecimalFormat("000.00").format(total) + "  |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|*******THANK YOU********|\"");
        System.out.println("\"+------------------------+\"");

        scn.close();

    }


}
