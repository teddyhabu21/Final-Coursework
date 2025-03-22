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
        ArrayList<String> left = new ArrayList<>(list.subList(0, cp));
        ArrayList<String> right = new ArrayList<>(list.subList(cp, list.size()));
        
        mergeSort(left);
        mergeSort(right);

        //Merge 
       
    }

}
