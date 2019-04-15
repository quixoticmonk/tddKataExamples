import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {
    @Test
    public void shouldReturnEmptyListfor1() {
        assertThat(factorsOf(1), is(Collections.<Integer>emptyList()));
    }

    @Test
    public void shouldReturn2for2() {
        assertThat(factorsOf(2), is((Collections.singletonList(2))));
    }

    @Test
    public void shouldReturn3for3() {
        assertThat(factorsOf(3), is((Collections.singletonList(3))));
    }

    @Test
    public void shouldReturnFactors() {
        assertThat(factorsOf(4), is((Arrays.asList(2, 2))));
        assertThat(factorsOf(5), is((Collections.singletonList(5))));
        assertThat(factorsOf(6), is((Arrays.asList(2, 3))));
        assertThat(factorsOf(7), is((Collections.singletonList(7))));
        assertThat(factorsOf(8), is((Arrays.asList(2, 2, 2))));
        assertThat(factorsOf(9), is((Arrays.asList(3, 3))));
        assertThat(factorsOf(10), is((Arrays.asList(2, 5))));
        assertThat(factorsOf(2*2*2*2*3*5*7*17), is((Arrays.asList(2,2,2,2,3,5,7,17))));
    }

    private List<Integer> factorsOf(int i) {
        int remainder = i;
        List<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;
        while (remainder > 1) {
            while (remainder % divisor == 0) {
                factors.add(divisor);
                remainder /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
