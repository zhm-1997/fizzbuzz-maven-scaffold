public class FizzBuzz {
    public static String of(int number) {
        String s = "";
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (number % 3 == 0) {
            s += "Fizz";
        }
        if (number % 5 == 0) {
            s += "Buzz";
        }
        if (number % 7 == 0) {
            s += "Whizz";
        }
        if (number % 15 == 0) {
            s += "FizzBuzz";
        }
        if (s.length() == 0) {
            s += number;
        }
        return null;
    }
}

