import static java.lang.String.format;

public class FizzBuzz {
    public static String transform(int number) {
        String string = "";
        if (number % 3 == 0) {
            string += "Fizz";
        }
        if (number % 5 == 0) {
            string += "Buzz";
        }
        if (string.equals("")) {
            return format("%d", number);
        }
        return string;
    }
}