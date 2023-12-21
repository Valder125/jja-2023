package lab8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        System.out.println(sum("У моїй бібліотеці є 15 книг з фантастики та 25 з наукової літератури"));
        System.out.println(sum("На столі лежать 3 олівці, 7 ручок і 2 блокноти"));
        System.out.println(isTag("<img/>"));
        System.out.println(isTag("<text>"));
        System.out.println(isTag("</body>"));
        System.out.println(isTag("<slash/"));
    }

    private static int sum(String text) { //Сума чисел в рядку
        int sum = 0;
        Matcher numbers = Pattern.compile("\\b-?\\d+\\b").matcher(text);
        while (numbers.find()) {
            sum += Integer.parseInt(numbers.group());
        };

        return sum;
    }

    private static boolean isTag(String text) { //Перевірка рядка на тег
        return text.matches("<.*>");
    }
}