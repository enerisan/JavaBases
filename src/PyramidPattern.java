public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }

}
    }


