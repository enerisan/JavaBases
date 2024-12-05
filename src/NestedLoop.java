public class NestedLoop {
    public static void main(String[] args) {

        int days = 7;
        int weeks = 3;
//outer loop for weeks
        for(int i = 1; i<= weeks; i++){
            System.out.println("Week  " + i);
            //inner loop for days
            for(int j = 1; j<=days; j++) {
                System.out.println("Day " + j);
            }
        }
    }
}
