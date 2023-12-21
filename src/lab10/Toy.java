package lab10;

public class Toy { //Іграшка
    private int minAge; //Мінімальний вік дитини
    private int maxAge; //Максимальний вік дитини
    private boolean eco;  //Іграшка екологічно чиста

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public boolean isEco() {
        return eco;
    }

    public void setEco(boolean eco) {
        this.eco = eco;
    }

    @Override
    public String toString() {
        return "Іграшка: вік [" + minAge + " - " + maxAge + "]" + (eco ? " | екологічно чиста" : "");
    }

    public Toy(int minAge, int maxAge, boolean eco) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.eco = eco;
    }
}