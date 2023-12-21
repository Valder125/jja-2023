package lab10;

@FunctionalInterface
public interface ToyFilter {
    abstract boolean check(Toy toy);
}