public class DieWithTime {
    public static void main(String[] args) {
      int die =0;
      long t = System.currentTimeMillis();
      int counter =0;
        while(die!=6){
            die = (int) (Math.random()* 300 +1);
            System.out.println(die);
counter ++;

        }
        System.out.println("It took " + (System.currentTimeMillis()-t) + " milliseconds");
        System.out.println("The die rolled "+ counter + " times");

    }
}
