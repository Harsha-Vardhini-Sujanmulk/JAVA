
public class StringBubbleSort {
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        String arr[] = { "ria","shahina","kalpana","honey","wasima" };
        
        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) { 
            //n-1
            int flag = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    //swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        printArray(arr);
    }
}

