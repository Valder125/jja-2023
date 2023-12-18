package Lab4;

public enum MobileTariff { //Типи оплати мобільних тарифів
    POSTPAID("постійний"),
    PREPAID("попередня оплата"),
    UNLIMITED("безліміт");

    private final String description;

    MobileTariff(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}