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
    }

    private static String MyException(Object o) throws NullPointerException { //Метод, що повертає помилка при наявності null
        if (o == null)  {
            throw new NullPointerException(); //Викидання виключення
        }

        return o.toString();
    }
}