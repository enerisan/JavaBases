import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the value of the die");
        int number1 = sc.nextInt();
        int result = (int) (Math.random()*10 +1 );
        if (number1 != result){
            System.out.print("You lose ...");
        }else {
            System.out.print("You win !!!");
        }
    }
}
