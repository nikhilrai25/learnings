import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] numbers) {
        int n = numbers.length;

        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;

            for (int i = 0; i < n - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }

            // If no pair was swapped, the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));
    }
}
