import static java.lang.String.format;

public class FizzBuzz {
    public static String transform(int number) {
        String returnStr = "";
        if (number % 3 == 0) {
            returnStr += "Fizz";
        }
        if (number % 5 == 0) {
            returnStr += "Buzz";
        }
        if (returnStr.equals("")) {
            return format("%d", number);
        }
        return returnStr;
    }
}