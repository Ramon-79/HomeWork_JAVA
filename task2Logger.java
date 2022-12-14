import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2Logger {

static Logger logger = Logger.getLogger(task2Logger.class.getName());
static ThreadLocalRandom randomNum = ThreadLocalRandom.current();

    public static void main(String[] args) throws IOException {
        int num = (randomNum.nextInt(5, 9));
        int[] array = new int[num];
        
        logger.setLevel(Level.WARNING);
        FileHandler file = new FileHandler("logger.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        RandMas(array, num);
        logger.log(Level.WARNING, Arrays.toString(array));
        SortMas(array, num);

    }
    private static void RandMas(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (randomNum.nextInt(0, 10));
        }
    }

    private static void SortMas(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    logger.log(Level.WARNING, Arrays.toString(arr));
                }
            }
        }
    }
}

