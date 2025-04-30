package aspa.intership.dr.variety.extra;

import java.time.LocalDate;
import java.util.List;

public class FusionMain {
    public static void main(String[] args) {
        List<Object> objects = List.of(
                "Hola mundo",
                42,
                LocalDate.now(),
                new Object()
        );
        identifyType(objects);
    }

    public static void identifyType(List<Object> objects) {
        objects
                .stream()
                .map(obj -> {
                    if (obj instanceof String s) {
                        return "Found a String: " + s;
                    } else if (obj instanceof Integer i) {
                        return "Found a Integer: " + i;
                    } else {
                        return "Unknown type: " + obj.getClass();
                    }
                })
                .forEach(System.out::println);
    }
}
