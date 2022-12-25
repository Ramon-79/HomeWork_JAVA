import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static void main(String[] args) {

      System.out.print("\033[H\033[2J");
System.out.flush();
      
      NoteBook notebook1 = new NoteBook(1, "Asus", "4", "500", "Windows", "white");
      NoteBook notebook2 = new NoteBook(2, "Samsung", "16", "800", "Lunex", "black");
      NoteBook notebook3 = new NoteBook(3, "Sony", "4", "800", "Windows", "black");
      NoteBook notebook4 = new NoteBook(4, "Aple", "16", "1000", "ios", "white");
      NoteBook notebook5 = new NoteBook(5, "Huawei", "8", "500", "Linux", "black");
      NoteBook notebook6 = new NoteBook(1, "Asus", "8", "1000", "Windows", "white");
      NoteBook notebook7 = new NoteBook(1, "Samsung", "4", "800", "Linux", "black");
      NoteBook notebook8 = new NoteBook(1, "Sony", "8", "1000", "Windows", "white");
      NoteBook notebook9 = new NoteBook(1, "Aple", "8", "500", "ios", "white");
      NoteBook notebook10 = new NoteBook(1, "Huawei", "16", "800", "Linux", "black");

      Set<NoteBook> notebooks = new HashSet<>(List.of(notebook1, notebook2, notebook3, notebook4, notebook5, 
         notebook6, notebook7, notebook8, notebook9, notebook10));

      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);

   }

   public static String scanner() {
      Scanner scan = new Scanner(System.in);
      String sc = scan.nextLine();
      return sc;
   }

   public static Map<String, String> selectCriteria() {
      
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         System.out.println("Введите 'y' для выбора параметров.\nВведите 'n' для просмотра списка.");
         System.out.print("Сюдой:  ");
         String question = scanner();
         if (question.equals("n")) {
            break;
         } else {

            System.out.println(
                  "Выберите необходимый пункт:" + 
                  " \n 1 - Название (Asus, Samsung, Sony, Aple, Huawei) " + 
                  "\n 2 - Размер RAM (4, 8, 16)" + 
                  "\n 3 - Размер HDD (500, 800, 1000)" + 
                  "\n 4 - Операционная система (Linux, ios, Windows)" + 
                  "\n 5 - Цвет (black, white)");
                  System.out.print("Тута: ");
            String key = scanner();
            System.out.print("\nВведите значения для выбранного критерия:  ");
            String value = scanner();

            resultCriterias.put(key, value);
         }
      }
      // System.out.println(resultCriterias);
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<NoteBook> notebooks) {

      Set<NoteBook> temp = new HashSet<>(notebooks);
      for (NoteBook notebook : notebooks) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                  temp.remove(notebook);

               }
               for (Object pair2 : criterias.keySet()) {

                  if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                     temp.remove(notebook);

                  }
                  for (Object pair3 : criterias.keySet()) {

                     if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                        temp.remove(notebook);

                     }
                     for (Object pair4 : criterias.keySet()) {

                        if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                           temp.remove(notebook);

                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("\nПо введенным критериям ничего не найдено!\n");
      } else {
         System.out.println("\nВот что мы можем предложить: \n\n" + temp.toString() + "\n");
      }

   }

}