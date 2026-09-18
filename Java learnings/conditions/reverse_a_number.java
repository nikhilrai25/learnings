import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            number = number / 10;

            reverse = reverse * 10 + digit;
        }

        System.out.println(reverse);
    }
}