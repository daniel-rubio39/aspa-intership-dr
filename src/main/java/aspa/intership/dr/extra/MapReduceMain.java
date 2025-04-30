package aspa.intership.dr.extra;

import java.util.List;

public class MapReduceMain {
    public static void main(String[] args) {
        // Tienes una lista de frases:
        // Queremos calcular:
        // Cuántas palabras totales hay.
        // Cuántas palabras únicas hay.
        // Reglas:
        // Las palabras se separan por espacio.
        // No distinguir mayúsculas/minúsculas (“Hola” = “hola”).
        List<String> phrases = List.of(
                "Hola mundo",
                "Aprendiendo Java",
                "Streams son poderosos",
                "Lambdas y Optionals"
        );
    }

    public static void countWords(List<String> phrases) {
        phrases
                .stream()
                .
    }
}
