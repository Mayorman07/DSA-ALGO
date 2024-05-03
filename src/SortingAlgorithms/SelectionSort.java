package SortingAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 5, 22, 11, 90, 12, 44, 2, 15, 32, 1};

        selectionSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int [] array) {
        int length = array.length;

        for(int i = 0; i < length - 1; i ++){
            int smallestIndex = i;
            for (int j = i + 1; j < length ; j ++){
                if (array[j] < array[smallestIndex]){
                     int temp = array[j];
                    array[j] = array[smallestIndex];
                    array[smallestIndex] = temp;
                }
            }
        }

    }
}
//Time complexity = > O(n ˆ 2)