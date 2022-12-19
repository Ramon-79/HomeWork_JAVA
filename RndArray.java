import java.util.concurrent.ThreadLocalRandom;
// import java.util.Arrays;

public class RndArray {

    // static ThreadLocalRandom randomNum = ThreadLocalRandom.current();
    // public static void main(String[] args) {

        // int len = (randomNum.nextInt(9, 15));
        // int[] array = new int[len];

        // RandMas();
        // int[] array2 = array;
        // System.out.println(len);
        // System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(array2));

    

    public static int[] RandMas(int[] array) {

        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int len = (randomNum.nextInt(9, 15));
        int[] arr = new int[len];
        
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (randomNum.nextInt(0, 10));
            }
            // System.out.println(Arrays.toString(arr));
        return arr;
        // int[] array2 = arr;
        
       
        }
    
    }
