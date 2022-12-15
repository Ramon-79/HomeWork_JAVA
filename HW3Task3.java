import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class HW3Task3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < rnd.nextInt(8, 16); i++) {
            int val = rnd.nextInt(0, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
        }
        System.out.printf("Максимальный элемент (функция max) %s\n", max);
        System.out.printf("Максимальный элемент (сравнение) %s\n", maxItem);
        System.out.printf("Минимальный элемент (функция min) %s\n", min);
        System.out.printf("Минимальный элемент (сравнение) %s\n", minItem);
        System.out.printf("Средний элемент, я не знаю как искать!!! \n");
    }
}