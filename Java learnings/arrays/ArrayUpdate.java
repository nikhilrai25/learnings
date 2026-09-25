public class ArrayUpdate {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Before update:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        numbers[2] = 100;

        System.out.println("\nAfter update:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
