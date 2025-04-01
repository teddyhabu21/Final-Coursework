// importing necessary java utilities
import java.util.ArrayList;
import java.util.List;

// public class to perform the mergesort method
public class mergeSort{
    public static ArrayList<String> splitSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return list; // when there is only 1 element or no element, it is already sorted, so it should return itself.
        }
        
        //splitting the list into two: 1) From the first element to the center point(cp) and 2) from cp to the last element.
        int cp = list.size() / 2;

        // Create empty ArrayLists for left and right halves
        ArrayList<String> left = new ArrayList<>(list.subList(0, cp));
        ArrayList<String> right = new ArrayList<>(list.subList(cp, list.size()));
        
        left = splitSort(left);
        right = splitSort(right);

        return merge(left, right);
       
    }
    
    //Method to merge the two halves back together.
     private static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        
        //creating an empty new list to store the sorted list
        ArrayList<String> merged = new ArrayList<>();
        
        while (leftIndex < left.size() && rightIndex < right.size()){
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0){
                merged.add(left.get(leftIndex));
                leftIndex++;
            }
            else{
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        // If there are remaining elements in the left list, add them
        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        // If there are remaining elements in the right list, add them
        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }
        return merged;
    }


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"));
        System.out.println("Before sorting: " + words); //printing out the raw list.
        
        words = splitSort(words);
        
        System.out.println("After sorting: " + words);//printing the sorted list
    }    

}
