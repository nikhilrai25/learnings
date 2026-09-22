public class Scope {

    public static void main(String[] args) {

        int a = 10;

        if (a > 5) {
            int b = 20;
            System.out.println(b);
        }

        System.out.println(a);

        // System.out.println(b); // Error: b is outside its scope
    }
}
