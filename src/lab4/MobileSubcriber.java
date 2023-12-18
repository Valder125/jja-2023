package lab4;

import lab3.*;

import java.util.LinkedList;
import java.util.Objects;

public class MobileSubcriber extends Subscriber { //Абонент мобільного зв'язку

    private MobileTariff type; //Тип оплати тарифу

    public MobileTariff getType() {
        return type;
    }

    public void setType(MobileTariff type) {
        this.type = type;
    }

    //Коструктор
    public MobileSubcriber(String name, String surName, String phoneNUmber, String email, int balance, MobileTariff type) {
        super(name, surName, phoneNUmber, email, balance);
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, phone, email, balance, type);
    }

    @Override
    public String toString() {
        return super.toString() + " , тип: " + type.getDescription() + "\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new MobileSubcriber(name, surName, phone, email, balance, type);
    }

    @Override
    public String compare(Subscriber o) {
        if (!(o instanceof MobileSubcriber)) return "Об'єкти різного типу";

        MobileSubcriber mobile = (MobileSubcriber)o;
        if (equals(mobile)) return "Об'єкти однакові";

        LinkedList<String> output = new LinkedList<>();
        if (!name.equals(mobile.name)) output.add("імена різні");
        if (!surName.equals(mobile.surName)) output.add("прізвища різні");
        if (!phone.equals(mobile.phone)) output.add("номери телефонів різні");
        if (!email.equals(mobile.email)) output.add("електронні адреси різні");
        if (!type.equals(mobile.type)) output.add("типи різні");
        return "Об'єкти різні: " + String.join(", ", output);
    }

    @Override
    public void pay(int amount) {
        switch (type)
        {
            case POSTPAID:
                balance -= amount;
                if (balance < 0) balance *= 2;
                break;
            case PREPAID:
                if (balance > amount) balance -= amount;
                type = MobileTariff.POSTPAID;
                break;
            case UNLIMITED:
                balance -= amount * 1.25;
                break;
        }
    }
}