import java.util.Scanner;
public class LoginProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set the correct username and password
        String correctUsername = "user123";
        String correctPassword = "password123";

        // Initialize the number of tries to 0
        int numTries = 0;

        // Loop while the user has not entered correct username and password and has not exceeded 3 tries
        while (numTries < 3) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Check if the entered username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                numTries++;
            }
        }

        // If the user has exceeded 3 tries, display an error message
        if (numTries == 3) {
            System.out.println("You have exceeded the maximum number of tries. Please try again later.");
        }

        input.close();
    }
}