// Bit Mask : 1 << pos
// Operation : AND with NOT

class ClearBit {
  public static void main(String args[]) {
    int n = 5;
    int pos = 3;
    int bitMask = 1 << pos;
    int newNumber = ((~bitMask) & n);
    System.out.println(newNumber);
  }
}
