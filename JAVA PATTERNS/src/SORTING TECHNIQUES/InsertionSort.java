// Insertion Sort
// Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly. 
// Time Complexity: O(N2) 

class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };
        int j;
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            for (j = i - 1; j >= 0 && current < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            //placement
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}