import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OddOrEvenTest {

    @Test
    public void shouldReturnEvenwWhenGiven0() {
        assertThat(oddOrEven(Collections.<Integer>emptyList()), is("Even"));
    }

    @Test
    public void shouldReturnEven() {
        assertThat(oddOrEven(Arrays.asList(0, 2, 4)), is("Even"));
        assertThat(oddOrEven(Arrays.asList(0, -2, -4)), is("Even"));
        assertThat(oddOrEven(Arrays.asList(0, -1, -5)), is("Even"));
    }

    @Test
    public void shouldReturnOdd() {
        assertThat(oddOrEven(Arrays.asList(1, 2, 4)), is("Odd"));
        assertThat(oddOrEven(Arrays.asList(1, -2, -4)), is("Odd"));
        assertThat(oddOrEven(Arrays.asList(2,5,34,6)), is("Odd"));
    }

    private String oddOrEven(List<Integer> asList) {
        int sum = 0;
        if (!asList.isEmpty()) {
            for (int i : asList) {
                sum += i;
            }
            if (sum % 2 == 0) {
                return "Even";
            } else
                return "Odd";
        }
        return "Even";
    }
}
