import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = input.next().trim().charAt(0);

            if (operator == 'x' || operator == 'X') {
                break;
            }

            if (operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/' ||
                operator == '%') {

                System.out.print("Enter two numbers: ");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                int result = 0;

                if (operator == '+') {
                    result = num1 + num2;
                }
                else if (operator == '-') {
                    result = num1 - num2;
                }
                else if (operator == '*') {
                    result = num1 * num2;
                }
                else if (operator == '/') {

                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }

                    result = num1 / num2;
                }
                else if (operator == '%') {

                    if (num2 == 0) {
                        System.out.println("Cannot use modulo by zero.");
                        continue;
                    }

                    result = num1 % num2;
                }

                System.out.println("Result = " + result);

            } else {
                System.out.println("Invalid operator.");
            }
        }

        System.out.println("Calculator closed.");
    }
}