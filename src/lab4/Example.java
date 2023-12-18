package lab4;

import lab3.*;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Subscriber[] subscribers = new Subscriber[] { //Масив абонентів
                new MobileSubcriber("Іван", "Петров", "+380991234567", "ivan.petrov@example.com", 217, MobileTariff.POSTPAID),
                new MobileSubcriber("Марія", "Сидорова", "+380972345678", "maria.sidorova@example.com", 642, MobileTariff.PREPAID),
                new MobileSubcriber("Олег", "Коваленко", "+380503456789", "oleg.kovalenko@example.com", -114, MobileTariff.PREPAID),
                new MobileSubcriber("Анна", "Шевченко", "+380664567890", "anna.shevchenko@example.com", 75, MobileTariff.UNLIMITED),
                new NetSubcriber("Павло", "Мельник", "+380935678901", "pavlo.melnik@example.com", 617, 100)
        };

        System.out.println(Arrays.toString(subscribers)); //Вивід інформації про всіх абонентів
        System.out.println(subscribers[0].equals(subscribers[1]) + " (0, 1), " + subscribers[1].equals(subscribers[1]) + " (1, 1)"); //Порівння абонентів через equals

        //Порівння абонентів через compare
        System.out.println(subscribers[0].compare(subscribers[0]));
        System.out.println(subscribers[1].compare(subscribers[2]));
        System.out.println(subscribers[3].compare(subscribers[4]));

        //Здіснення оплати для всіх абонентів
        int price = 250;
        for (Subscriber user : subscribers)
        {
            System.out.print("\n" + user.getBalance() + " - " + price + " = ");
            user.pay(price);
            System.out.print(user.getBalance());
        }
    }
}