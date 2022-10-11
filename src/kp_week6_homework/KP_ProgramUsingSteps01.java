package kp_week6_homework;

//Kaushik Patel
public class KP_ProgramUsingSteps01 {
    /* 1. Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme.
    */

    int a = 50;
    String b = "now I am instance and in main via instance method";

    public static void main(String[] args) {

        KP_ProgramUsingSteps01 obj = new KP_ProgramUsingSteps01();
        obj.kpMehtod();

    }

    public void kpMehtod() {

        System.out.println(a);
        System.out.println(b);


    }


}
