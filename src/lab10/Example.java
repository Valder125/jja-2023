package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>(Arrays.asList(
                new Toy(0, 3, true),
                new Toy(3, 6, true),
                new Toy(3, 6, false),
                new Toy(5, 12, true),
                new Toy(7, 13, false),
                new Toy(10, 14, true),
                new Toy(14, 18, false)));

        //Через ToyFilter
        ToyFilter[] filters = new ToyFilter[] { Toy::isEco, toy -> toy.isEco() && toy.getMinAge() <= 3, toy -> toy.getMaxAge() > 10 };

        for (ToyFilter filter : filters) {
            for (Toy toy : toys) {
                if (filter.check(toy)) {
                    System.out.println(toy);
                }
            }
        }

        //Через Predicate
        ArrayList<Predicate<Toy>> predicates = new ArrayList<>(Arrays.asList(Toy::isEco, toy -> toy.isEco() && toy.getMinAge() <= 3, toy -> toy.getMaxAge() > 10));

        for (Predicate<Toy> predicate : predicates) {
            for (Toy toy : toys) {
                if (predicate.test(toy)) {
                    System.out.println(toy);
                }
            }
        }
    }
}