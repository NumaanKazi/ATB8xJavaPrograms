package sept.ex_13092024;

public class Task2 {
    public static void main(String[] args) {
//        Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
//        double a = 34;
//        double b = 10;
//        Print - a+b, a-b, ab, a/b, a%b all the outputs.

        double a = 34 , b=10;

        // Calculations
        double addition = a+b;
        double substraction = a-b;
        double multiplication = a*b;
        double devision = a/b;
        double modulus = a%b;

        // print statement
        System.out.println("Addition of a + b = " +addition);
        System.out.println("Substraction of a - b = " + substraction);
        System.out.println("Multiplication of a * b = " +multiplication);
        System.out.println("Devision of a / b = " +devision);
        System.out.println("Modulus of a % b = " +modulus);

        // Modulus operator
        System.out.printf("Addition of two numbers (a+b) %f + %f = %f" ,a,b,a+b);
        System.out.println();
        System.out.printf("Substraction of two numbers (a-b) %f - %f = %f" ,a,b,a-b);
        System.out.println();
        System.out.printf("Multiplication of two numbers (axb) %f x %f = %f" ,a,b,a*b);
        System.out.println();
        System.out.printf("Devision of two numbers (a/b) %f / %f = %f" ,a,b,a/b);
        System.out.println();
        System.out.print("Modulus of two numbers a and b = ");
        System.out.print(a%b);



    }
}
