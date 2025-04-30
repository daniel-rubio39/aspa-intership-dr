package aspa.intership.dr.variety.extra;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAndGroupMain {
    public static void main(String[] args) {
        groupByAge();
    }

    public static void groupByAge() {
        record Person(String name, int age) {
        }
        List<Person> people = List.of(
                new Person("Ana", 23),
                new Person("Luis", 31),
                new Person("Pedro", 23),
                new Person("Lucía", 28),
                new Person("Marta", 31)
        );

        Map<Integer, List<Person>> map = people
                .stream()
                .collect(Collectors.groupingBy(Person::age));

        map.forEach((age, peopleV) -> {
            String names = peopleV
                    .stream()
                    .map(Person::name)
                    .collect(Collectors.joining(", "));
            System.out.println("Edad: " + age + " -> " + names);
        });
    }
}
