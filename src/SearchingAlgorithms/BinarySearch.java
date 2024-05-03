package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int searchedValue = 5;

        int result = binarySearch (array, 5);

        System.out.print("The index of " + searchedValue + " is " + result);

    }

    public static int binarySearch(int[] array, int searchedValue) {

        int length = array.length;
        int leftPoint =  0;
        int rightPoint = length - 1;


        while( leftPoint <= rightPoint){

            int middlePoint = (leftPoint + rightPoint)/2;
            int middleValue = array[middlePoint];

            if(searchedValue == middleValue){
                return middlePoint;
            }
            if(searchedValue > middleValue){
                leftPoint = middlePoint + 1;
            }
            else {
                rightPoint = middlePoint - 1;
            }
        }
        return -1;
    }

}


//Time complexity => O(log n)