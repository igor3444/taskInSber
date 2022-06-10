package functionTest;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class SortingTest {

    int[] array = {9, -3, 4, 1, 7, 12, 3, 1, 6, 4};
    int[] expectedResult = {-3, 1, 1, 3, 4, 4, 6, 7, 9, 12};


    @Test
    public void sorting() {
        Sorting.sorting(array, 0, array.length - 1);
        assertIterableEquals(Arrays.asList(expectedResult[0],expectedResult[4],expectedResult[9]), Arrays.asList(array[0],array[4],array[9]));
    }
}
