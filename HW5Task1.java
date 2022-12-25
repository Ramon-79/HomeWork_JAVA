import java.util.HashMap;
import java.util.List;

public class HW5Task1
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPhoneBook("Сергеев", "8 909 767 5676", "8 898 343 4444");   // Здесь можно организовать добавление.
        findPhone("Сергеев");                                                  // Здесь организовываем поиск.
    }

    public static void addPhoneBook(String name, String num1, String num2) {
        phoneBook.put(name, List.of(num1, num2));
        phoneBook.put("Иванов", List.of("999 99 99", "888 88 88"));
        phoneBook.put("Петров", List.of("333 33 33", "444 44 44"));
        phoneBook.put("Сидоров",List.of("222 22 22", "666 66 66"));

    }

    public static void findPhone(String secondname) {
        System.out.printf("%s: %s", secondname, phoneBook.get(secondname));
    }
}