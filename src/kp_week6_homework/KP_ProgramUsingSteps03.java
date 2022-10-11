package kp_week6_homework;

//Kaushik Patel
public class KP_ProgramUsingSteps03 {
    /*
    3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
    print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int m = 200;
    static String n = "we are instance and static bro in main via static and instance method";

    public static void main(String[] args) {

        imStatic();
        KP_ProgramUsingSteps03 obj2 = new KP_ProgramUsingSteps03();
        obj2.imInstance();

    }

    public static void imStatic(){
        KP_ProgramUsingSteps03 obj = new KP_ProgramUsingSteps03();
        System.out.println(obj.m);
        System.out.println(n);

    }

    public void imInstance(){

        System.out.println(m);
        System.out.println(KP_ProgramUsingSteps03.n);

    }

}
