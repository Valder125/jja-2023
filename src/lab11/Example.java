package lab11;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        for (Method method : Calculator.class.getMethods()) { //Перевірка всіх анотацій всіх методів класу Calculator, зокрема перевірка @SafeVarags
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation.annotationType());
                if (annotation instanceof SafeVarargs) {
                    System.out.println("Безпечно");
                }
            }
        }

        //Дії з базами даних з перевіркою користувача за наявності @PostAuthorized
        try { //Заглушка
            Database base = new Database(25);
            execute(base, Database.class.getMethod("read"));
            execute(base, Database.class.getMethod("write", int.class), 34);
            execute(base, Database.class.getMethod("read"));
            execute(base, Database.class.getMethod("write", int.class), 77);
            execute(base, Database.class.getMethod("read"));
        } catch (Exception e) {};
    }

    @SafeVarargs
    private static void execute(Database base, Method method, Object... params) throws InvocationTargetException, IllegalAccessException { //Викликає методи із бази даних, перевіряючи користувачів за наявності @PostAuthorized
        method.invoke(base, params);

        if (method.isAnnotationPresent(PostAuthorize.class)) {
            System.out.println("Введіть пароль:");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextLine() && scan.nextLine().equals("qwerty"))
                System.out.println("Успіх");
            else
                System.exit(0);
        }
    }
}