import java.util.Scanner;


public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();


        String res_sum = Sum(n);
        String res_mult = Mult(n);
        System.out.println("Сумма = " + res_sum);
        System.out.println("Произведение = " + res_mult);
    }
    

    public static String Sum(int value) {
        int res_sum = 0;
        for (int i = 1; i <= value; i++) {
            res_sum += i;
        }
        return String.valueOf(res_sum);
    }

    public static String Mult(int value) {
        int res_mult = 1;
        for (int i = 1; i <= value; i++) {
            res_mult *= i;
        }
        return String.valueOf(res_mult);
    }
    }
    