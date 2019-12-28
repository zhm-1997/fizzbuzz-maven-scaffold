import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz() {
        int number=3;
        String result= FizzBuzz.of(number);
        assertThat(result).isEqualTo("Fizz");
    }


}