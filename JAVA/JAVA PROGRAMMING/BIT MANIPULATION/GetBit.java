// Get Bit
// Get the 3rd(pos=2) of a num n. (n = 0111)
// Bit Mask : 1<<pos
// Operation : AND
// Example : 1<<3 => 0001 << 3 => 1000
// Now, 1000 & 0111 => 0000
public class GetBit {
  public static void main(String args[]) {
    int n = 7;
    int pos = 3;
    int bitMask = 1 << pos;

    if ((bitMask & n) == 0) {
    System.out.println(bitMask & n);
  } else {
    System.out.println(1);
  }
  }
}