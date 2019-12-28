import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz() {
        int number=3;
        String result= FizzBuzz.transform(number);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void should_return_Buzz() {
        int number=5;
        String result= FizzBuzz.transform(number);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    public void should_return_FizzBuzz() {
        int number=15;
        String result= FizzBuzz.transform(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }


}