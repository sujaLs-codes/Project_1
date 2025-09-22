import java.util.Scanner;

public class Java_Console_Calculator {

    // Methods for each operation
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n<===== Java Console Calculator =====>");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result = " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result = " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result = " + divide(num1, num2));
                        break;
                }
            } else if (choice == 5) {
                exit = true;
                System.out.println("Exiting Calculator... Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select from 1-5.");
            }
        }

        sc.close();
    }
}
