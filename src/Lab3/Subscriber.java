package Lab3;

import java.util.Objects;
import Lab4.*;

public abstract class Subscriber implements Payable { //Абонент
    protected String name; //Ім'я
    protected String surName; //Прізвище
    protected String phone; //Номер телефону
    protected String email; //Електронна адреса
    protected int balance; //Баланс (рахунок)

    protected static int count; //Кількість екзкмплярів класу

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //Конструктор
    public Subscriber(String name, String surName, String phone, String email, int balance) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(surName, that.surName) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, phone, email);
    }

    @Override
    public String toString() {
        return name + " " + surName +
                " | номер: +380" + phone +
                " , email: " + email +
                " , баланс: " + balance + "₴";
    }

    public abstract String compare(Subscriber o); //Порівняння з іншим об'єктом
}