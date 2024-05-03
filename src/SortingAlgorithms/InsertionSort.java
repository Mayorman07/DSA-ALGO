package SortingAlgorithms;

public class InsertionSort {

    static int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12, 44, 2, 15, 32, 10, 34};
    static int length = my_array.length;

    public static void main(String[] args) {
        for(int i = 1; i < length ; i ++){

            int currentTempLoopValue = my_array[i];
            int j = i - 1;  

            while(j >= 0 && my_array[j] > currentTempLoopValue){
                my_array[j + 1]  =  my_array[j];
                j --;
            }
            my_array[j + 1] = currentTempLoopValue;
        }

        for(int num : my_array){
            System.out.print(num + " ");
        }
    }
}


//Time complexity => O(n ˆ 2)