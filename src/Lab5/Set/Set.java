package Lab5.Set;

import Lab5.Operation.*;

import java.util.Arrays;

public class Set<T> {
    private final T[] setArray;

    public Set(T[] array) {
        this.setArray = array;
    }
    public T[] getSet() {
        return setArray;
    }
    public static void main(String[] args) {
        // Приклад використання з цілими числами
        Set<Integer> intSet1 = new Set<>(new Integer[]{1, 2, 3, 4});
        Set<Integer> intSet2 = new Set<>(new Integer[]{3, 4, 5, 6});

        Operation<Integer> intOperation = new Operation<>();

        // Об'єднання множин
        System.out.println("Робота з числами");

        Integer[] unionResult = intOperation.unionSets(intSet1.getSet(), intSet2.getSet());
        System.out.println("Об'єднані множини: " + Arrays.toString(unionResult));
        // Перетин множин
        Integer[] intersectionResult = intOperation.intersectionSets(intSet1.getSet(), intSet2.getSet());
        System.out.println("Спільні значення: " + Arrays.toString(intersectionResult));

        // Різниця множин
        Integer[] differenceResult = intOperation.differenceSets(intSet1.getSet(), intSet2.getSet());
        System.out.println("Різниця множин: " + Arrays.toString(differenceResult));

        // Симетрична різниця множин
        Integer[] symmetricDiffResult = intOperation.symmetricDiffSets(intSet1.getSet(), intSet2.getSet());
        System.out.println("Симетрична різниця множин: " + Arrays.toString(symmetricDiffResult));

        System.out.println();

        // Приклад використання з рядками
        Set<String> stringSet1 = new Set<>(new String[]{"Володимир", "Василь", "Сергій"});
        Set<String> stringSet2 = new Set<>(new String[]{"Сергій", "Петро", "Василь"});

        Operation<String> stringOperation = new Operation<>();

        // Об'єднання множин
        System.out.println("Робота з рядками");
        String[] stringUnionResult = stringOperation.unionSets(stringSet1.getSet(), stringSet2.getSet());
        System.out.println("Об'єднані множини: " + Arrays.toString(stringUnionResult));

        // Перетин множин
        String[] stringIntersectionResult = stringOperation.intersectionSets(stringSet1.getSet(), stringSet2.getSet());
        System.out.println("Спільні значення: " + Arrays.toString(stringIntersectionResult));

        // Різниця множин
        String[] stringDifferenceResult = stringOperation.differenceSets(stringSet1.getSet(), stringSet2.getSet());
        System.out.println("Різниця множин: " + Arrays.toString(stringDifferenceResult));

        // Симетрична різниця множин
        String[] stringSymmetricDiffResult = stringOperation.symmetricDiffSets(stringSet1.getSet(), stringSet2.getSet());
        System.out.println("Симетрична різниця множин: " + Arrays.toString(stringSymmetricDiffResult));

        System.out.println();

        // Приклад використання з цілими символами
        Set<Character> charSet1 = new Set<>(new Character[]{'a', 'b','c', 'd'});
        Set<Character> charSet2 = new Set<>(new Character[]{'c', 'd', 'e', 'f'});

        Operation<Character> charOperation = new Operation<>();

        // Об'єднання множин
        System.out.println("Робота з символами");
        Character[] charUnionResult = charOperation.unionSets(charSet1.getSet(), charSet2.getSet());
        System.out.println("Об'єднані множини: " + Arrays.toString(charUnionResult));

        // Перетин множин
        Character[] charIntersectionResult = charOperation.intersectionSets(charSet1.getSet(), charSet2.getSet());
        System.out.println("Спільні значення: " + Arrays.toString(charIntersectionResult));

        // Різниця множин
        Character[] charDifferenceResult = charOperation.differenceSets(charSet1.getSet(), charSet2.getSet());
        System.out.println("Різниця множин: " + Arrays.toString(charDifferenceResult));

        // Симетрична різниця множин
        Character[] charSymmetricDiffResult = charOperation.symmetricDiffSets(charSet1.getSet(), charSet2.getSet());
        System.out.println("Симетрична різниця множині: " + Arrays.toString(charSymmetricDiffResult));

    }
}