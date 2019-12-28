import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
    }

    public void should_return_Fizz() {
        int number = 3;
        String result = FizzBuzz.of(number);
        assertThat(result).isEqualTo("Fizz");
    }


}