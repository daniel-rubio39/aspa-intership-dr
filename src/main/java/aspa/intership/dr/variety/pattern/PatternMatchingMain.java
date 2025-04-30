package aspa.intership.dr.variety.pattern;

public class PatternMatchingMain {
    public static void main(String[] args) {
        printStringLength("Hello World");
        addIfIntegers(1, 2);
    }

    public static void printStringLength(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s.length());
        } else {
            System.out.println("No es un string.");
        }
    }

    public static void addIfIntegers(Object a, Object b) {
        if (a instanceof Integer num1 && b instanceof Integer num2) {
            System.out.println(num1 + num2);
        } else {
            System.err.println("No es un entero.");
        }
    }
}