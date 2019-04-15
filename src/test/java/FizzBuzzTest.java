import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void shouldReturnNumber() {
        assertThat(fizzBuzz(1), is("1"));
        assertThat(fizzBuzz(2), is("2"));
        assertThat(fizzBuzz(4), is("4"));
    }

    @Test
    public void shouldReturnFizz() {
        assertThat(fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzz() {
        assertThat(fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertThat(fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz(30), is("FizzBuzz"));
    }

    private String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
