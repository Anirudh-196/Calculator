import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        addition(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);
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
}