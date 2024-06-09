package Pattern;

/*
   * Q2. Left Triangle Star Pattern
   */

public class LeftTriangle {
    String a = """
                *
               **
              ***
             ****
            *****
                     """;

    public static void main(String[] args) {
        leftTriangle1(5);
        leftTriangle2(5);
    }

    public static void leftTriangle1(int n) {

        int c = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            c--;
        }
    }

    public static void leftTriangle2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
