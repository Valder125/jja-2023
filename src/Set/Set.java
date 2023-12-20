package Set;

import java.util.Arrays;
import java.util.Objects;

public class Set<T> {
    private final T[] setArray;

        public Set(T[] array) {
        this.setArray = array;
    }
    public T[] getSet() {
        return setArray;
    }

}
