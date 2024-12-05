import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to add please !");
        //collecting the user number
        int number1= sc.nextInt();
        System.out.println("Enter first number to add please !");
        int number2= sc.nextInt();
        System.out.println("The sum of your numbers  is " + (number1 + number2) );

    }
}
