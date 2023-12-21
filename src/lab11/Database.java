package lab11;

public class Database {
    private int number;

    public void read() {
        System.out.println(number);
    }

    @PostAuthorize
    public void write(int value) { //Метод доступний не кожному користувачу
        number = value;
    }

    public Database(int number) {
        this.number = number;
    }
}