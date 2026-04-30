import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*].*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
