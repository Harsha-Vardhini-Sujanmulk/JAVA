// For 0                          For 1
// Clear Bit                      Set Bit
// Bit Mask : 1<<i                Bit Mask : 1<<i                
// Operation : AND with NOT       Operation : OR

import java.util.*;

class UpdateBit {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int val = sc.nextInt();
  // oper = 1 : set bit
  // oper = 0 : clear bit
  int n = 5;
  int pos = 1;

  int bitMask = 1 << pos;
  if (val == 1) {
    int newNumber = bitMask | n;
    System.out.println(newNumber);
  } else {
    int newNumber = (~bitMask) & n;
    System.out.println(newNumber);
  }
}  
}
