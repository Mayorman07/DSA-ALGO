package SearchingAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int [] array = {64, 34, 25, 5, 22, 11, 90, 12, 44, 2, 15, 32, 1};
        int searchedValue = 5;

        int result = linearSearch(array, searchedValue);
        if(result != -1){
            System.out.print("The index of " + searchedValue + " is " + result);
        } else{
            System.out.print("The index of " + searchedValue + "does not exist");
        }

    }

    public static int linearSearch(int [] array, int searchedValue) {
        int length = array.length;

        for(int i = 0; i < length; i ++){
            if(array[i] == searchedValue){
                return i;
            }
        } return -1;
    }
}


//Time Complexity O(n)