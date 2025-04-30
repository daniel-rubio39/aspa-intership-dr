package aspa.intership.dr.variety.streams;

import java.util.List;

public class StreamsMain {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Luis", "Pedro", "María", "Lucía");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        getUpperNamesWithMoreThanFourLetters(names).forEach(System.out::println);
        System.out.println(getSumOfSquareOfPeers(numbers));
    }

    // Filtra los nombres que tienen más de 4 letras y conviértelos a mayúsculas usando Streams.
    public static List<String> getUpperNamesWithMoreThanFourLetters(List<String> names) {
        return names
                .stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .toList();
    }

    // Filtra los numeros pares, elevalos al cuadrado y suma los resultados
    public static Integer getSumOfSquareOfPeers(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> (int) Math.pow(number, 2))
                .sum();
    }
}