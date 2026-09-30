import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Count with even digits: " + findNumbers(nums));
        input.close();
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums) {
            if (hasEvenDigits(number)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return false;
        }

        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;
        }

        return digits % 2 == 0;
    }
}
