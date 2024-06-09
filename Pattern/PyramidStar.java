package Pattern;
/*
 * Pyramid Star Pattern
     * 
    * * 
   * * * 
  * * * * 
 * * * * *
 */

public class PyramidStar {
    public static void main(String[] args) {
        pyramidStar(5);
    }

    public static void pyramidStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
