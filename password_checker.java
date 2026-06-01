import java.util.Scanner;

public class password_checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Common Password Detection
        if(password.equals("123456") ||
           password.equals("password") ||
           password.equals("admin") ||
           password.equals("qwerty")) {

            System.out.println("⚠ Very Common Password!");
            System.out.println("Choose a safer password.");
            return;
        }

        int score = 0;

        // Scoring
        if(password.length() >= 8)
            score++;

        if(password.matches(".*[A-Z].*"))
            score++;

        if(password.matches(".*[a-z].*"))
            score++;

        if(password.matches(".*\\d.*"))
            score++;

        if(password.matches(".*[!@#$%^&*].*"))
            score++;

        System.out.println("Score: " + score + "/5");

        // Strength Bar
        System.out.print("Strength Bar: ");
        for(int i = 0; i < score; i++) {
            System.out.print("#");
        }
        System.out.println();

        // Suggestions
        if(!password.matches(".*[A-Z].*"))
            System.out.println("Add an uppercase letter");

        if(!password.matches(".*[a-z].*"))
            System.out.println("Add a lowercase letter");

        if(!password.matches(".*\\d.*"))
            System.out.println("Add a number");

        if(!password.matches(".*[!@#$%^&*].*"))
            System.out.println("Add a special character");

        if(password.length() < 8)
            System.out.println("Password should be at least 8 characters");

        // Password Classification
        if(score <= 2) {
            System.out.println("Weak Password");
        }
        else if(score <= 4) {
            System.out.println("Medium Password");
        }
        else {
            System.out.println("Strong Password");
        }

        // AI Style Advice
        if(score <= 2) {
            System.out.println("AI Advice: Your password is vulnerable to attacks.");
        }
        else if(score <= 4) {
            System.out.println("AI Advice: Improve by adding more complexity.");
        }
        else {
            System.out.println("AI Advice: Excellent password security.");
        }

        // Suggested Password Generator
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

        String generated = "";

        for(int i = 0; i < 12; i++) {
            int index = (int)(Math.random() * chars.length());
            generated += chars.charAt(index);
        }

        System.out.println("Suggested Password: " + generated);

        sc.close();
    }
}
