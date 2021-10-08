public class FindMax {

    public static Integer maxOfInteger(Integer A, Integer B, Integer C) {
        Integer max = A;
        if (B.compareTo(max) > 0)
            max = B;
        if (C.compareTo(max) > 0)
            max = C;
        return max;
    }

    public static Float maxOfFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0)
            max = f2;
        if (f3.compareTo(max) > 0)
            max = f3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer A = 50, B = 58, C = 512;
        System.out.println("The Maximum between three integers is : " + maxOfInteger(A, B, C));
        Float f1 = 7.5f, f2 = 9.2f, f3 = 7.4f;
        System.out.println("The Maximum between three float is : " + maxOfFloat(f1, f2, f3));
    }
}
