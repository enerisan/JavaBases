import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number please!");
        int number1 = sc.nextInt();
        System.out.println("Enter your second number please!");
        int number2= sc.nextInt();
        int result = number1+number2;
System.out.println("Sum of numbers is " + result);
    }
}
