import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        ToIntFunction<String> toLength = String::length;
        strings.sort(Comparator.comparingInt(toLength));

        System.out.println(strings);


        System.out.println("-----------------");


        List<User> users=Arrays.asList(new User("Ola", 12),new User("Marek", 9),new User("Beatka", 43),new User("Beatka", 46));

        Comparator<User> cmpByName = (u1,u2)->u1.getName().compareTo(u2.getName());
        Comparator<User> cmpByAge=(u1,u2)->Integer.compare(u1.getAge(),u2.getAge());

        Comparator<User> byNamethenByAge = cmpByName.thenComparing(cmpByAge);
        users.sort(byNamethenByAge);

        System.out.println(users);


    }
}
