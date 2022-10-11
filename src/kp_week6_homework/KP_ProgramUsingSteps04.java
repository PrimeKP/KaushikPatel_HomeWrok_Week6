package kp_week6_homework;
//Kaushik Patel
public class KP_ProgramUsingSteps04 {
    /*
    4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
    print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
     */

    int j = 500;
    static String k = "i am static bro";
    static int i = 600;
    String m = "i am instance bro";

    public static void main(String [] args){

        KP_ProgramUsingSteps04 obj2 = new KP_ProgramUsingSteps04();
        obj2.imInstance();
        imStatic();

    }

    public void imInstance(){

        System.out.println(j + " " + m);
        System.out.println(KP_ProgramUsingSteps04.i + " "+ KP_ProgramUsingSteps04.k);

    }

    public static void imStatic(){

        KP_ProgramUsingSteps04 obj = new KP_ProgramUsingSteps04();
        System.out.println(obj.j + " " + obj.m);
        System.out.println(KP_ProgramUsingSteps04.i + " "+ KP_ProgramUsingSteps04.k);

    }

}
