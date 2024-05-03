package SortingAlgorithms;

public class MergeSort {


    public static void main(String[] args) {
        int[] array = {64, 34, 25, 5, 22, 11, 90, 12, 44, 2, 15, 32, 10, 34, 45, 61, 1, 19};
        mergeSort(array);

        for(int num : array){
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] array) {

        int length = array.length;

        if(length < 2){
            return;
        }
        int midPoint = length/2;
        int [] leftHalf = new int [midPoint];
        int [] rightHalf = new int[length - midPoint];

        for(int i = 0; i < midPoint ; i ++){
            leftHalf[i] = array[i];
        }
        for(int i = midPoint; i < length ; i ++){
            rightHalf[i - midPoint] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array,leftHalf,rightHalf);

    }

    public static void merge(int[] array, int[]leftHalf, int[]rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }
            else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i< leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j< rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }

    }

}

//Time Complexity =>  O(n log n)
