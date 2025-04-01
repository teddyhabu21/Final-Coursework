import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class sorterTest {

    @Test
    public static void test1() {
        ArrayList<String> words = new ArrayList<>(List.of("b", "c", "a"));
        String[] expected = new String[]{"a", "b", "c"};
        String[] actual = Sorter.splitSort(words).toArray(new String[0]); // Convert to array ✅
        
        System.out.println("Expected: " + List.of(expected));
        System.out.println("Actual: " + List.of(actual));
        
        assertArrayEquals(expected, actual);
        
    }
}
