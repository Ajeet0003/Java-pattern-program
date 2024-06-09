package Pattern;

public class DiamondStar {

    String pattern = """
                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *
                                 """;

    public static void main(String[] args) {
        diamondStar(5);
    }

    public static void diamondStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        int b = n;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < b; k++) {
                if (k == 1 || k == b - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            b--;
            System.out.println();
        }
    }
}
