import java.util.Scanner;

public class BasketBall {
    public static void main(String[] args) {
        int weight;
        int height;
        int age;
        System.out.println("Welcome to our Basketball Team");
        Scanner sc = new Scanner(System.in);
        System.out.println(("Your weight?"));
        weight = sc.nextInt();
        System.out.println(("Your height?"));
        height = sc.nextInt();
        System.out.println(("Your age?"));
        age = sc.nextInt();

        if(weight > 220 && height >63 && age<25){
            System.out.println("Test passed");
        }else {
            System.out.println(("Test failed"));
        }





    }
}
