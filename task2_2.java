import java.util.Scanner;

public class task2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = scanner.nextInt();

        int count = 0;

        for (int i = 2; i < input; i++) {

            boolean Num = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Num = false;
                    break;
                }
            }

            if (Num) {
                count++;
                System.out.print(i + ", ");

            }

        }
        System.out.println("Элементов: " + count);
    }

    
}
