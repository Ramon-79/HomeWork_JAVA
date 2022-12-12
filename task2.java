import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) throws IOException {
        int[] array = { 9, 4, 7, 3, 5, 7, 3, 5 }; 
        File file = new File("log.txt");
        file.createNewFile();
        File file2 = new File("log2.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter pw = new PrintWriter(file2);       
        int temp; 
        for (int i = array.length - 1; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                if (array[j] > array[j + 1]) { 
                    temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp;
                    pw.println(Arrays.toString(array));
                    fileWriter.write(Arrays.toString(array));
                    fileWriter.write("\n");
                    // System.out.println(Arrays.toString(array));
                }
            }
        }
        fileWriter.close();
        pw.close();
        System.out.println(Arrays.toString(array));
    }
}