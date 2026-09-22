public class Varargs {

    static void numbers(int... nums) {

        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        numbers(1);
        numbers(1, 2);
        numbers(1, 2, 3, 4, 5);
    }
}
