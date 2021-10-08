import java.util.Arrays;

    public class FindMax<F extends Comparable<F>> {

        F[] elements;

        public FindMax(F[] elements) {
            this.elements = elements;
        }

        public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
            Arrays.sort(elements);
            int length = elements.length;
            T max = elements[length - 1];
            System.out.printf("Maximum value of three is %s ", max);
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to the program to find maximum value using generics");
            Integer[] intMax = {5, 10, 48, 50, 42, 45, 412, 598};
            maxOfValues(intMax);
            Float[] floatMax = {8.35f, 97.8f, 4.45f, 0.8f, 8.6f};
            maxOfValues(floatMax);
            String[] stringMax = {"ABC", "IJK", "PQWR", "BCSD", "MNPO", "LTMN", "ZRST", "UXYZ"};
            maxOfValues(stringMax);
        }
    }
