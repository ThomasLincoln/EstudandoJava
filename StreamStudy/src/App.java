import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream");

        List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> show = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(show);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        Set<Integer> squarSet 
            = numbers.stream()
            .map(x -> x * x)
            .collect(Collectors.toSet());

        System.out.println(squarSet);


        number.stream()
            .map(x -> x)
            .forEach(y -> System.out.println(y));

        int even
            = number.stream()
            .filter(x -> x % 2 == 0)
            .reduce(0, (ans, i) -> ans + i);
        
        System.out.println(even);
    }
}
