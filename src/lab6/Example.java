package Lab6;

import Lab3.*;
import Lab4.*;

import java.util.EnumSet;
import java.util.IdentityHashMap;

public class Example {
    public static void main(String[] args) {
        EnumSet<MobileTariff> tariffs = EnumSet.of(MobileTariff.POSTPAID, MobileTariff.PREPAID); //Створюємо екземпляри мнохини
        System.out.println(tariffs);

        //Додавання елементів
        tariffs.add(MobileTariff.POSTPAID); //Не додасться, бо вже наявний
        tariffs.add(MobileTariff.UNLIMITED);
        System.out.println(tariffs);

        //Видалення елементів
        tariffs.remove(MobileTariff.UNLIMITED);
        tariffs.remove(MobileTariff.UNLIMITED); //Не видалиться, бо відсутній
        System.out.println(tariffs);

        IdentityHashMap<String, Subscriber> subscribers = new IdentityHashMap<>(); //Створюємо екземпляри таблиці

        //Ключі фактично однакові, але мають різну "ідентичність"
        String firstKey = new String("RyGloPQv21");
        String secondKey = new String("RyGloPQv21");

        //Додавання елементів
        subscribers.put(firstKey, new MobileSubcriber("Іван", "Петров", "+380991234567", "ivan.petrov@example.com", 217, MobileTariff.POSTPAID));
        subscribers.put(secondKey, new MobileSubcriber("Марія", "Сидорова", "+380972345678", "maria.sidorova@example.com", 642, MobileTariff.PREPAID));
        subscribers.put("XaLk4uMn8p", new MobileSubcriber("Олег", "Коваленко", "+380503456789", "oleg.kovalenko@example.com", -114, MobileTariff.PREPAID));
        subscribers.put("Zw3bYsDx6a", new NetSubcriber("Павло", "Мельник", "+380935678901", "pavlo.melnik@example.com", 617, 100));
        System.out.println(subscribers);

        //Видалення елементів
        subscribers.remove("XaLk4uMn8p");
        System.out.println(subscribers);
        subscribers.remove("Zw3bYsDx6a");
        System.out.println(subscribers);

        //Зміна атрибутів елементів
        subscribers.get(firstKey).setBalance(1000);
        System.out.println(subscribers);
    }
}