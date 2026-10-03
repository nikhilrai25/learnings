import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Works on an ascending sorted array.
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Avoids possible integer overflow.
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
