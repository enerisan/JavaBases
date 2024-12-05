import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        int result= (int) (Math.random() * 6+ 1);

        System.out.println("Result "+ result);
    }
}
