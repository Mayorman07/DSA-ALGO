package SortingAlgorithms;

public class BubbleSort{

    public static void main(String[] args) {

        int[] array = {64, 34, 25, 5, 22, 11, 90, 12};

        bubbleSort(array);

        for ( int num : array){
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {

        int length = array.length;

        for(int i = 0; i < length - 1; i ++){
            for(int j = 0; j < length - i - 1 ; j ++){
                if(array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

}


//Time complexity = > O(n ˆ 2)
