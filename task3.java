import java.util.Scanner;

public class task3 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print(
			"Введите первое и второе число: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.print(
			"Выберите тип операции (+, -, *, /, %): ");
		char op = scanner.next().charAt(0);
		res(a, b, op);
	}
	public static int res(int a, int b, char op)
	{
		int ans = 0;
		if (op == '+') {
			ans = a + b;
		}
		else if (op == '-') {
			ans = a - b;
		}
		else if (op == '*') {
			ans = a * b;
		}
		else if (op == '%') {
			ans = a % b;
		}
		else if (op == '/') {
			ans = a / b;
		}

		System.out.println("Результат = " + ans);
		return ans;
	}
}


