import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//К калькулятору из предыдущего дз добавить логирование.
public class task4Calc {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task4Calc.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("Calclog.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        Scanner input = new Scanner(System.in);
        System.out.print("Первое число: ");
        double num1 = input.nextInt();
        System.out.print("Действие: ");
        String op = input.next();
        System.out.print("Второе число: ");
        double num2 = input.nextInt();
        double ans = 0;

        switch (op) {
            case "*" -> ans = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
                else {
                    System.out.print("На ноль делить нельзя\n");
                }
            }
            case "+" -> ans = num1 + num2;
            case "-" -> ans = num1 - num2;
            default -> System.out.print("Что то пошло не так");
        }
        System.out.println("Результат = " + ans + "\n");
        // System.out.print(ans + "\n");
        logger.log(Level.INFO,num1 + " " + op + " " + num2 + " = " + ans  + "\n");
        file.close();
    }
}