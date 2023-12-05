import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        int passedTests = 0;

        do {
            // Get password
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            // Test 1
            if (password.length() >= 12) {
                passedTests++;
            } else {
                System.out.println("Your password should be at least 12 characters long.");
            }

            // Test 2
            if (password.matches(".*[A-Z].*")) {
                passedTests++;
            } else {
                System.out.println("Your password should contain at least one uppercase character.");
            }

            // Test 3
            if (password.matches(".*[a-z].*")) {
                passedTests++;
            } else {
                System.out.println("Your password should contain at least one lowercase character.");
            }

            // Test 4
            if (password.matches(".*[0-9].*")) {
                passedTests++;
            } else {
                System.out.println("Your password should contain at least one number.");
            }

            // Test 5
            if (password.matches(".*[!#$%].*")) {
                passedTests++;
            } else {
                System.out.println("Your password should contain at least one special character.");
            }

            System.out.printf("Your password passed %d/5 tests\n", passedTests);

            // Retry?
            if (!InputHelper.getYNConfirm(scanner,"Would you like to check another password? [Y/N]")) {
                cont = false;
            } else {
                passedTests = 0;
            }
        } while (cont);

    }
}