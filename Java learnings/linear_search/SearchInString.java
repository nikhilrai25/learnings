import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter character to search: ");
        char target = input.next().charAt(0);

        System.out.println("Character index: " + search(text, target));

        input.close();
    }

    static int search(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
