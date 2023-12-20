package lab9;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(); //Список об'єктів
        list.add("Текст");
        list.add(null);
        list.add(25);

        for (Object item : list) { //Використання методу для списку
            try {
                System.out.println(MyException(item));
            } catch (NullPointerException e) { //Обробка помилки
                System.out.println("Вказано null");
            }
        }

        //Обробка всіх варіантів помилок
        execute(new Methods(), -1, 1);
        execute(new Methods(), 0, 1);
        execute(new Methods(), 0, 0);
        execute(new Methods(), 1, 1);
    }

    private static void execute(Methods methods, float a, float b) { //Обробляє помилки в Methods
        try {
            System.out.println(methods.add(a, b));
        }
        catch (Exception e) { //Обробка помилки
            System.out.println(e);
        }
    }

    private static String MyException(Object o) throws NullPointerException { //Метод, що повертає помилка при наявності null
        if (o == null)  {
            throw new NullPointerException(); //Викидання виключення
        }

        return o.toString();
    }
}