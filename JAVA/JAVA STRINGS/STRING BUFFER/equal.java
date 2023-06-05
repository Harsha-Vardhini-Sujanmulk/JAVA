

public class equal {
  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("honey");
    StringBuffer sb2 = new StringBuffer("honey");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));
  }
}
