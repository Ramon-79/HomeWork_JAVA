import java.util.ArrayList;
import java.util.Random;

public class HW3Task2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < rnd.nextInt(15, 21); i++) {
            int val = rnd.nextInt(-99, 100);
            list.add(val);
        }
        System.out.printf("Исходный список %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел %s", list);
    }
    
}
