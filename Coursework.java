// importing necessary java utilities
import java.util.ArrayList;
import java.util.List;

// public class to perform the mergesort method
public class Merge_Sort{
    public static void mergeSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return; // when there is only 1 element or no element, it is already sorted.
        }
        
        //splitting the list into two: 1) From the first element to the center point(cp) and 2) from cp to the last element.
        int cp = list.size() / 2;

        // Create empty ArrayLists for left and right halves
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();

        // Copy elements to left half
        for (int i = 0; i < cp; i++) {
            left.add(list.get(i));
        }

        // Copy elements to right half
        for (int i = cp; i < list.size(); i++) {
            right.add(list.get(i));
        }

        
        mergeSort(left);
        mergeSort(right);

        merge(list, left, right)
       
    }
    //Method to merge the two halves back together.
     private static void merge(ArrayList<String> merged, ArrayList<String> left, ArrayList<String> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = 0;
        
        while (leftIndex < left.size && rightIndex < right.size){
            if (left[leftIndex] <= right[rightIndex]){
                merged[mergeIndex] = left[leftIndex];
                leftIndex++;
            }
            else{
                merged[mergeIndex] = right[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }
        while (leftIndex < left.size){
            inputArray[mergeIndex] = left[leftIndex];
            leftIndex++;
            mergeIndex++;
        }
        while (rightIndex < right.size){
            inputArray[mergeIndex] = right[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
    }    

}
