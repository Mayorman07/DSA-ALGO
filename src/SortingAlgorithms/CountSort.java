package SortingAlgorithms;

public class CountSort {

    public static void main(String[] args) {
        int[] array = {9, 3, 2, 5, 2, 1, 9, 1, 4, 2, 5, 3, 1, 4};
        countingSort(array);

        for(int num : array){
            System.out.print(num + " ");
        }
    }
    public static void countingSort(int[] array) {

        int maxValue = array[0];
        for(int num : array){
            if(num > maxValue){
                maxValue = num;
            }
        }

        int [] count = new int[maxValue + 1];

        for(int num : array){
            count[num]++;
        }

        int index = 0;
        for(int i = 0 ; i <= maxValue; i ++){
            while(count[i] > 0){
                array[index] = i;
                index ++;
                count[i]--;
            }
        }

    }

}

//O(n + k )
