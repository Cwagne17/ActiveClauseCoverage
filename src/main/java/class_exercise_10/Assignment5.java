package class_exercise_10;

public class Assignment5 {
    public static void checkIt(boolean a, boolean b, boolean c) {
        if (a && (b || c))
            System.out.println("P is true");
        else
            System.out.println("P is false");
    }

    public static String twoPred(int x, int y) {
        boolean z;

        if (x < y)
            z = true;
        else
            z = false;

        if (z && x + y == 10)
            return "A";
        else
            return "B";
    }
}
