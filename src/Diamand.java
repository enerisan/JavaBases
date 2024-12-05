public class Diamand {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        do {
            int j=1;
            int k=0;
           do {
               System.out.print("-");
               j++;
               }

           while(j <= rows - i);
           do{
               System.out.print("* ");
               k++;
           }while(k <= rows - j);

            i++;
            System.out.println();
        }while(i<=rows);

        do {
            int l=1;
            int m=0;
            do {
                System.out.print(" ");
                l++;
            }

            while(l <= rows - i);
            do{
                System.out.print("* ");
                m++;
            }while(m <= rows - l);

            i--;
            System.out.println();
        }while(i>0);

        }
}