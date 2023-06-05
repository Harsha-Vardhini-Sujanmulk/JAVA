// Bit Mask  : 1 << pos (where "pos" is the no. of positions the bit should move)
// Operation : OR 
// Set Bit
// Set the 2nd bit(pos = 1)
public class SetBit {
  public static void main(String args[]) {
    int n = 5;
    int pos = 1;
    int bitMask = 1 << pos;
    int newNumber = bitMask | n;
    System.out.println(newNumber);
  }  
}
