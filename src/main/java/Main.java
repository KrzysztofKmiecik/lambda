import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        ToIntFunction<String> toLength = String::length;
        strings.sort(Comparator.comparingInt(toLength));

        System.out.println(strings);


    }
}
