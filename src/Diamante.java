public class Diamante {
    public static void main(String[] args) {
        int rows =5;
        int  i=1;
        do{
        int j=1;
        while (j<= rows-i){
            System.out.print(" ");
            j++;
        }
        int k=1;
        while (k<=i){
            System.out.print("* ");
            k++;
        }
        System.out.println();
        i++;
        }

        while(i<=5);
i=5;
        do{
            int l=1;
            while ( l<= rows-i+1){
                System.out.print(" ");
                l++;
            }
            int m=1;
            while (m <= i-1){
                System.out.print("* ");
                m++;
            }
            System.out.println();
            i--;
        }
        while(i>=1);
    }
}
