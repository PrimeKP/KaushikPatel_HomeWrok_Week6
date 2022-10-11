package kp_week6_homework;
//Kaushik Patel

public class KP_ExpressionResult {
    /*12. Write a Java program to compute the specified expressions and print the
        output.
        Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output : 2.138888888888889
    */

    public static void main(String [] args){

        KP_ExpressionResult obj = new KP_ExpressionResult();
        obj.expressionResult();

    }

    public void expressionResult(){

        System.out.println("Expected Output: " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        System.out.println("As Amitbhai said to us that it is hardcore data and want" +
                " exactly the same result as shown, hence scanner unility not used -kaushik");
    }
}
