import java.util.concurrent.ThreadLocalRandom;

public class RndArray {


public static int[] RandMas() {

        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int len = (randomNum.nextInt(9, 15));
        int[] array = new int[len];
        
            for (int i = 0; i < array.length; i++) {
                array[i] = (randomNum.nextInt(0, 10));
            }
        return array;
        }


public static int[] RandMas(int n, int a, int b) {
            ThreadLocalRandom randomNum = ThreadLocalRandom.current();
            
            int len = n;
            int[] array = new int[len];
            
                for (int i = 0; i < array.length; i++) {
                    array[i] = (randomNum.nextInt(a, b));
                }
            return array;
            }
        }