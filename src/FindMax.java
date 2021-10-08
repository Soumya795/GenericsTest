import java.util.Arrays;

    public class FindMax<T extends Comparable<T>> {

        T[] elements;

        public FindMax(T[] elements) {
            this.elements = elements;
        }

        public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
            Arrays.sort(elements);
            int length = elements.length;
            T max = elements[length - 1];
            System.out.printf("Maximum value of three is %s :  ", max);
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to the program to find maximum value using generics");
            Integer[] intMax = {10, 24, 68, 80, 42, 46, 12, 58};
            maxOfValues(intMax);
            Float[] floatMax = {1.4f, 87.3f, 81.8f, 40.2f, 4.6f};
            maxOfValues(floatMax);
            String[] stringMax = {"ABC", "IJK", "PQR", "BCD", "MNO", "LMN", "RST", "XYZ"};
            maxOfValues(stringMax);
        }
    }
