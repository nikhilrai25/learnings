public class ArrayAsParameter {

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static int findSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        printArray(numbers);

        int sum = findSum(numbers);
        System.out.println("Sum: " + sum);
    }
}
