package aspa.intership.dr.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> names = List.of("Pedro", "Luis", "Jose", "Ana", "Lucía");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sortWordsByLength(names).forEach(System.out::println);
        filterByPredicate(numbers, n -> n % 2 == 0).forEach(System.out::println);
    }

    public static List<String> sortWordsByLength(List<String> words) {
        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort(Comparator.comparingInt(String::length));
        return sortedWords;

        // OTRAS OPCIONES
        // return words
        //        .stream()
        //        .sorted(Comparator.comparingInt(String::length))
        //        .toList();
    }

    public static List<Integer> filterByPredicate(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers
                .stream()
                .filter(predicate)
                .toList();
    }
}