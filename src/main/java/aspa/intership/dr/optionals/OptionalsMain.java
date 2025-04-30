package aspa.intership.dr.optionals;

import java.util.Optional;

public class OptionalsMain {
    public static void main(String[] args) {
        System.out.println(getStringLength(Optional.of("Hola soy Daniel")));
        System.out.println(parseInteger(String.valueOf(5)));
    }

    public static int getStringLength(Optional<String> input) {
        return input.map(String::length).orElse(0);
    }

    public static Optional<Integer> parseInteger(String input) {
        if (input != null && !input.isEmpty()) {
            return Optional.of(Integer.parseInt(input));
        }
        return Optional.empty();
    }
}