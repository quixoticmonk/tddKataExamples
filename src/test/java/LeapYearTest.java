import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearTest {
    @Test
    public void shouldReturnTrue() {
        assertThat(isLeapYear(2012), is(true));
        assertThat(isLeapYear(2000), is(true));
    }

    @Test
    public void shouldReturnFalse() {
        assertThat(isLeapYear(2100), is(false));
        assertThat(isLeapYear(2102), is(false));
        assertThat(isLeapYear(1984), is(true));

    }

    private Boolean isLeapYear(int i) {
        if (i % 4 == 0) {
            if (i % 100 == 0) {
                return i % 400 == 0;
            } else
                return true;
        } else
            return false;
    }
}
