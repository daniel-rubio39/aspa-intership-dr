package aspa.intership.dr.referenced;

import java.util.ArrayList;
import java.util.List;

public class ReferencedMain {
    public static void main(String[] args) {
        // Ejercicio 4.1
        // list.forEach(System.out::println)
        List<String> words = List.of("Apple", "banana", "apricot", "Blueberry");
        sortWordsNoCaseSensitive(words).forEach(System.out::println);
    }

    public static List<String> sortWordsNoCaseSensitive(List<String> words) {
        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort(String::compareToIgnoreCase);
        return sortedWords;
    }
}