package kp_week6_homework;
//Kaushik Patel
public class KP_ProgramUsingSteps02 {
    /*2.1 Declare two static variables
    2.2 Declare one static method
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and Run the programme.
    */

    static int x = 100;
    static String y = "now i am static and in main method via static";

    public static void main(String [] args){

        kpMethod();

    }

    public static void kpMethod(){

        System.out.println(x);
        System.out.println(y);

    }

}
