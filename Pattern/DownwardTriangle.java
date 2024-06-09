package Pattern;

public class DownwardTriangle {
    String pattern = """
            * * * * *
            * * * *
            * * *
            * *
            *
                """;

    public static void main(String[] args) {
        downwardTriangle1(5);
        downwardTriangle2(5);
    }

    public static void downwardTriangle1(int n) {
        int b = n;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b--;
            System.out.println();
        }
    }

    public static void downwardTriangle2(int n) {
        // for inner loop
        for (int i = n - 1; i >= 0; i--) {

            // for outer loop
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
