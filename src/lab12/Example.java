package lab12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example {
    public static void main(String[] args) {
        System.out.println(toUts(LocalDateTime.now())); //Отримання поточних дати й часу в UTC
        System.out.println(toLocal(ZonedDateTime.now(ZoneId.of("UTC")))); //Отримання поточних місцевих дати й часу
    }

    private static ZonedDateTime toUts(LocalDateTime local) { //Перетворення в UTC
        return local.atZone(ZoneId.of("UTC"));
    }

    private static LocalDateTime toLocal(ZonedDateTime utc) { //Перетворення в місцевий час
        return utc.toLocalDateTime();
    }
}