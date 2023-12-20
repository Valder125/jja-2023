package lab9;

public class Methods {

    private static void checkExceptions(float a, float b) throws IllegalAccessException {
        if (a < 0 && b > 0)
            throw new IllegalArgumentException();
        else if ((a == 0 && b != 0) && (b == 0 && a != 0))
            throw new ArithmeticException();
        else if (a == 0 && b == a)
            throw new IllegalAccessException();
        else if (a > 0 && b > 0)
            throw new NullPointerException();
    }

    public static float add(float a, float b) throws IllegalAccessException { //Додавання
        checkExceptions(a, b);
        return a + b;
    }

    public static float subtract(float a, float b) throws IllegalAccessException {//Віднімання
        checkExceptions(a, b);
        return a - b;
    }

    public static float multiply(float a, float b) throws IllegalAccessException { //Множення
        checkExceptions(a, b);
        return a * b;
    }

    public static float divide(float a, float b) throws IllegalAccessException { //Ділення
        checkExceptions(a, b);
        return a / b;
    }
}