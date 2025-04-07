import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class sorterTest {
    @Test
    public static void test1() {
        ArrayList<String> words = new ArrayList<>(List.of("b", "c", "a"));
        String[] expected = new String[]{"a", "b", "c"};
        String[] actual = Sorter.splitSort(words).toArray(new String[0]); 
        //the splitSort method from the Sorter class is being called with the words Arraylist. 
        //Then the result of the method is converted back to array.
        
        System.out.println("Expected list: " + List.of(expected));
        System.out.println("Actual Outcome: " + List.of(actual));
        
        //the test asserts that the expected array id equal to the actual outcome 
        //of the method using jUnit's assertArrayEquals method.
        assertArrayEquals(expected, actual);
        
    }
    
    // this part is for the second part of the question checking if the method 
    //sorts out the months in alphabetical order.
    @Test
    public static void test2() {
        ArrayList<String> months = new ArrayList<>(List.of("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"));
        String[] expected = new String[]{"April", "August", "December", "February", "January", "July",
            "June", "March", "May", "November", "October", "September"};
        String[] actual = Sorter.splitSort(months).toArray(new String[0]); 
        //the splitSort method from the Sorter class is being called with the months Arraylist. 
        //Then the result of the method is converted back to array.
        
        System.out.println("Expected list: " + List.of(expected));
        System.out.println("Actual Outcome: " + List.of(actual));
        
        //the test asserts that the expected array id equal to the actual outcome 
        //of the method using jUnit's assertArrayEquals method.
        assertArrayEquals(expected, actual);
    }
}
