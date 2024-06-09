package Pattern;

/*
* Q1. Right Triangle Star Pattern
*
**
***
****
***** 
* 
*/
public class RightTriangle {
    public static void main(String[] args) {
        rightTriangle(5);
    }

    public static void rightTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
