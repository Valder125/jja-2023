package Lab2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int n = scanner.nextInt(); //змінна для введеного користувачем числа

        long sum = 0;//змінна для суми чисел Фібоначчі, що менші за число користувача
        long previous = 0;//змінна для попереднього числа
        long current = 1;//змінна для теперішнього числа
        /*
        while (current < n) {//цикл відбувається поки теперішнє число буде меншим за число користувача
            sum += current;//додаємо до суми теперішнє число
            long next = previous + current;//створюємо наступне число Фібоначчі
            previous = current;//змінюємо попереднє число
            current = next;//змінюєсо теперішнє число
        }
*/

        while (current < n) {//цикл відбувається поки теперішнє число буде меншим за число користувача
            sum += current;//додаємо до суми теперішнє число
            current = previous+current;//змінюєсо теперішнє число
            previous = current-previous;//змінюємо попереднє число
        }
        System.out.println("Сума всіх чисел Фібоначчі менших за " + n + " дорівнює " + sum);//виводимо результат
    }
}
