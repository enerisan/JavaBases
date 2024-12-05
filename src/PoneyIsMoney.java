public class PoneyIsMoney {
    public static void main(String[] args) {
        int poney = 0;
        long t = System.currentTimeMillis();
               while (poney <=1000000){
            poney++;
            System.out.println("Poney number " + poney );
        }
        System.out.println("It took " + (System.currentTimeMillis()-t) + " milliseconds");
    }
}
