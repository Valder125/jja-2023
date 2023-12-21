package lab11;

public class Calculator {
    @SafeVarargs
    public static int avg(int... numbers) { //Середнє значення
        if (numbers.length == 0) { //Перевірка можливих помилок
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
}