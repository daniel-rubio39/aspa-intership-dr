package aspa.intership.dr.extra;

import java.util.List;
import java.util.Optional;

public class AdvancedOptionalMain {
    public static void main(String[] args) {
        List<Optional<Integer>> list = List.of(Optional.empty(), Optional.of(1), Optional.of(2), Optional.of(3));
        System.out.println("MEDIA: " + averageOptionals(list).orElse(0.0));
    }

    public static Optional<Double> averageOptionals(List<Optional<Integer>> optionals) {
        double sum;

        if (!optionals.isEmpty()) {
            long count = optionals
                    .stream()
                    .filter(Optional::isPresent)
                    .count();

            if (count > 0) {
                sum = optionals
                        .stream()
                        .filter(Optional::isPresent)
                        .mapToDouble(Optional::get)
                        .sum();

                return Optional.of(sum / count);
            }
        }
        return Optional.empty();
    }
}
