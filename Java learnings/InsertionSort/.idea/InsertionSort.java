import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1, 2};

        insertionSort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            // Shift larger values one position to the right.
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }
    }
}
