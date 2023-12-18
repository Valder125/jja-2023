package Lab4;

import Lab3.*;

import java.util.LinkedList;
import java.util.Objects;

public class NetSubcriber extends Subscriber { //Інтернет абонент

    private float speed; //Швидкість інтернету

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public NetSubcriber(String name, String surName, String phone, String email, int balance, float speed) {
        super(name, surName, phone, email, balance);
        this.speed = speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, phone, email, balance, speed);
    }

    @Override
    public String toString() {
        return super.toString() + " , швидкість: " + speed + "Мбт/с\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new NetSubcriber(name, surName, phone, email, balance, speed);
    }

    @Override
    public String compare(Subscriber o) {

        if (!(o instanceof NetSubcriber)) return "Об'єкти різного типу";

        NetSubcriber net = (NetSubcriber)o;
        if (equals(net)) return "Об'єкти однакові";

        LinkedList<String> output = new LinkedList<>();
        if (!name.equals(net.name)) output.add("імена різні");
        if (!surName.equals(net.surName)) output.add("прізвища різні");
        if (!phone.equals(net.phone)) output.add("номери телефонів різні");
        if (!email.equals(net.email)) output.add("електронні адреси різні");
        if (speed != net.speed) output.add("швидкість різна");
        return "Об'єкти різні: " + String.join(", ", output);
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
    }
}