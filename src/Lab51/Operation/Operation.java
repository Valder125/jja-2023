package Lab51.Operation;
import Lab51.Set.Set;

import java.util.Arrays;
import java.util.Objects;

public class Operation<T> {
    // Об'єднання множин
    public T[] unionSets(T[] set1, T[] set2) {
        T[] result = Arrays.copyOf(set1, set1.length + set2.length);
        int index = set1.length;

        for (T element : set2) {
            if (!contains(result, element)) {
                result[index++] = element;
            }
        }

        return Arrays.copyOf(result, index);
    }

    // Перетин множин
    public T[] intersectionSets(T[] set1, T[] set2) {
        int minSize = Math.min(set1.length, set2.length);
        T[] result = Arrays.copyOf(set1, minSize);
        int index = 0;

        for (T element : set1) {
            if (contains(set2, element)) {
                result[index++] = element;
            }
        }

        return Arrays.copyOf(result, index);
    }

    // Різниця множин
    public T[] differenceSets(T[] set1, T[] set2) {
        T[] result = Arrays.copyOf(set1, set1.length);
        int index = 0;

        for (T element : set1) {
            if (!contains(set2, element)) {
                result[index++] = element;
            }
        }

        return Arrays.copyOf(result, index);
    }

    // Симетрична різниця множин
    public T[] symmetricDiffSets(T[] set1, T[] set2) {
        T[] unionResult = unionSets(set1, set2);
        T[] intersectionResult = intersectionSets(set1, set2);

        return differenceSets(unionResult, intersectionResult);
    }

    // Перевірка, чи містить масив певний елемент
    private boolean contains(T[] array, T element) {
        for (T value : array) {
            if (Objects.equals(value, element)) {
                return true;
            }
        }
        return false;
    }
}

