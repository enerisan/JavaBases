public class DiamanteFor {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=5;i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=5;i>=1;i--){
            for(int l=1;l<=rows-i;l++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
