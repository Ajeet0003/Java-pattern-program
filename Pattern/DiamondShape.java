package Pattern;

public class DiamondShape {
    String pattern = """
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
                   """;

    public static void main(String[] args) {
        diamondShape(5);
    }

    public static void diamondShape(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        int b = n;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < b; k++) {
                System.out.print(" *");

            }
            b--;
            System.out.println();
        }
    }
}
