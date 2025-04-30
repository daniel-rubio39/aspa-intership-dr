package aspa.intership.dr.variety.multiline;

public class MultilineMain {
    public static void main(String[] args) {
        printMultiline();
        System.out.println(countLinesOfMultiline());
    }

    public static void printMultiline() {
        String text = """
                lorem ipsum dolor sit amet adipiscing els
                consectetur adipiscing els
                consectetur adipiscing els
                AI broke. Curious, that.
                """;
        System.out.println(text);
    }

    public static long countLinesOfMultiline() {
        String text = """
                Uno
                Dos
                Tres
                Cuatro
                """;

        return text.lines().count();
    }
}