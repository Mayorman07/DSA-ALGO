package SortingAlgorithms;

public class QuickSort {


    public static void main(String[] args) {

        int[] array = {7, 12, 9, 21, 3, 0, 64, 34, 25, 32, 22, 41, 90, 5, 22, 14, 11, 55, 65, 86, 19, 100, 53, 32, 45, 55, 61,12};

        int length = array.length;
        quickSort(array, 0, length - 1);

        for(int num : array){
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int [] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer ++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer --;
            }

            swap(array,leftPointer, rightPointer);
         }
            swap(array,leftPointer, highIndex);

            quickSort(array,lowIndex, leftPointer - 1);
            quickSort(array, leftPointer + 1, highIndex);

    }

    private static void swap(int [] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }


}
//Time complexity = > O(n log n)