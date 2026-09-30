import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target: ");
        int target = input.nextInt();

        int index = search(arr, target);
        System.out.println("Target index: " + index);

        input.close();
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
