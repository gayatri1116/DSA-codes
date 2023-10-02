public class program2 {
    public static void inverted(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // System.out.println();

    public static void main(String args[]) {
        inverted(10);
    }

}
