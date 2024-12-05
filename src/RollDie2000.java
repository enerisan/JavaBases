public class RollDie2000 {
    public static void main(String[] args) {
        int result = 0;
        int i =0;
        long t = System.currentTimeMillis();
        do {
            result = (int) (Math.random() * 2000 + 1);
            System.out.println(result);
            i++;

        }
        while (result != 6);{
            System.out.println("Die has been rolled " + i + " times");
            System.out.println("Time : " + (System.currentTimeMillis() - t) + " milliseconds");
        }
    }


}
