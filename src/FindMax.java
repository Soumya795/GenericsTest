import java.util.Arrays;

public class FindMax {

    public static Integer maxOfInteger(Integer A, Integer B, Integer C) {
        Integer max = A;
        if (B.compareTo(max) > 0)
            max = B;
        if (C.compareTo(max) > 0)
            max = C;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer A = 50, B = 58, C = 512;
        System.out.println("The Maximum between three integers is : " + maxOfInteger(A, B, C));
    }
}
