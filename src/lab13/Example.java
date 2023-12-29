package lab13;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 5, -10, 20, 7, -3, 15, 0, -8, 12, 42, -23, 9, -17, 33, 2, -6, 11, 18, -25 }; //Масив цілих чисел
        System.out.println(Arrays.stream(numbers).average().getAsDouble()); //Середнє значення
    }
}