package SortingAlgorithms;

public class RadixSort {

    public static void main(String[] args) {
        int [] array = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(array);

        for(int num : array){
            System.out.print(num + " ");
        }

    }

    public static void radixSort(int[] array) {

        int maxValue = findMax(array);
        int exponent = 1;

        while(maxValue/exponent > 0 ){

            int [] [] radixArray = new int [10][array.length];
            int [] counts = new int [10];

           for(int value : array){
              int  radixIndex = (value/exponent) % 10;
              radixArray[radixIndex] [counts[radixIndex]] = value;
              counts[radixIndex]++;
           }

           int position = 0;
           for(int i = 0; i < 10; i ++){
               for (int j = 0; j < counts[i]; j ++){
                   array[position] = radixArray[i][j];
                   position ++;
               }
           }

            exponent *= 10;
        }

    }

    public static int findMax(int[] array) {
        int max = array[0];
        for(int value : array) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

}


//Time complexity = > O(nk)