import java.util.Scanner;

public class CasinoAdvanced {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 10 +1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the roll of die from 1 to 10");
        int yourNumber = sc.nextInt();
        while(yourNumber != die){
            System.out.println("You lose");
            System.out.println("Guess the roll of die from 1 to 10");
            yourNumber = sc.nextInt();
        }
        if(yourNumber == die){
            System.out.println("You win");
        }




    }
}
