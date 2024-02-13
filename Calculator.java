public class Calculator {
    public static void main(String[] args) {
        int a=20;
        System.out.println(" the first number is:"+a);
        int b=10;
        System.out.println(" the second number is:"+b);
        addition(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);
        square(a);
        cube(a);
    }

    public static void addition(int a, int b) {
        System.out.println("Reasult of Addition is:"+(a+b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Reasult of Substraction is:"+(a-b));
    }

    public static void division(int a, int b) {
        if(b == 0) {
            System.out.println("Division: Division by zero is not allowed.");
        } else {
            System.out.println("Reasult of Division is:"+(a/b));
        }
    }

    public static void multiplication(int a, int b) {
        System.out.println("Reasult of Multiplication is:"+(a*b));
    }
    public static void square(int a){
        System.out.println("Result of Square is: "+ (a * a));
    }
    public static void cube(int a){
        System.out.println("Result of Cube is: "+ (a * a * a));
    }
}
