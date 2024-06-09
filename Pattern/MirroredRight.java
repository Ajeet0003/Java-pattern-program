package Pattern;

public class MirroredRight {
    String pattern = """
            * * * * *
            * * * *
            * * *
            * *
            *
                """;

    public static void main(String[] args) {
        mirroredRight1(5);
        mirroredRight2(5);
    }

    public static void mirroredRight1(int n) {
        // for inner loop
        int b=1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <b; j++) {
                System.out.print("*");
            }
            b++;
            System.out.println();
        }
    }

    public static void mirroredRight2(int n) {
        // for inner loop
        int b=1;
        for (int i = n ; i >0; i--) {
            for (int j = 0; j <2*(i-1); j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j<b; j++) {
                System.out.print("* ");
            }
            b++;
            System.out.println();
        }
    }
}
