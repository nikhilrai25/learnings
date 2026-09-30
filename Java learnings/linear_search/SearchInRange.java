import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter character to search: ");
        char target = input.next().charAt(0);

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        System.out.println("Character index: " + search(text, target, start, end));

        input.close();
    }

    static int search(String text, char target, int start, int end) {
        if (text.isEmpty()) {
            return -1;
        }

        if (start < 0 || end >= text.length() || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
