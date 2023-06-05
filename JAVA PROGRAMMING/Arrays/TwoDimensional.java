import java.util.Arrays;
import java.util.Scanner;
public class TwoDimensional {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a[][] = new int[3][3];
      System.out.println(a.length);
      for (int row = 0; row < a.length; row++) {
        for (int col = 0; col < a[row].length; col++) {
          a[row][col] = sc.nextInt();
        }
      }

      // for (int row = 0; row < a.length; row++) {
      //   for (int col = 0; col < a[row].length; col++) {
      //     System.out.print(a[row][col] + " ");
      //   }
      //   System.out.println();
      // }

      for (int row = 0; row < a.length; row++) {
      System.out.println(Arrays.toString(a[row]));
      }
 
    }
  }
}
