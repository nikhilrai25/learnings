public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println();

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
