import java.util.Scanner;

public class HW5Task3 {

public void SortArray(int arr[]) {
    int N = arr.length;

    for (int i = N / 2 - 1; i >= 0; i--)
        heap(arr, N, i);

    for (int i = N - 1; i > 0; i--) {

        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        heap(arr, i, 0);
    }
}

void heap(int arr[], int N, int i) {
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if (l < N && arr[l] > arr[largest])
        largest = l;

    if (r < N && arr[r] > arr[largest])
        largest = r;

    if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

        heap(arr, N, largest);
    }
}

static void printArray(int arr[]) {
    int N = arr.length;

    for (int i = 0; i < N; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}

public static void main(String args[]) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int n = in.nextInt();
            int[] array = RndArray.RandMas(n, 1, 10);

            HW5Task3 ob = new HW5Task3();
            ob.SortArray(array);
            printArray(array);
        }
}
}