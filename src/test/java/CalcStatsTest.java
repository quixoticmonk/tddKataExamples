import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalcStatsTest {
    @Test
    public void shouldReturnMinimum() {
        assertThat(minimumOfAlist(Collections.singletonList(2)), is(2));
        assertThat(minimumOfAlist(Arrays.asList(1, 2)), is(1));
        assertThat(minimumOfAlist(Arrays.asList(3, 2)), is(2));
        assertThat(minimumOfAlist(Arrays.asList(3, 2, 1)), is(1));

        //assertThat(minimumOfAlist(Arrays.asList(12, 2, 3, 77, 45)), is(2));
        //assertThat(minimumOfAlist(Arrays.asList(12, 22, 3, 77, 45)), is(3));
    }

    private int minimumOfAlist(List<Integer> inputList) {
        int sizeOfList = inputList.size();
        int minimum = inputList.get(0);
        if (sizeOfList > 1) {
            for (int item : inputList) {
                if (minimum > item) {
                    minimum = item;
                }
            }
        }
        return minimum;
    }

}
