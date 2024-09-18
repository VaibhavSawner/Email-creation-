package Emailpackage;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first name:");
        String firstName = sc.nextLine();
        
        System.out.println("Enter the last name:");
        String lastName = sc.nextLine();
        
        // Create a new Email object
        Email email = new Email(firstName, lastName);
        
        // Show email information
        System.out.println(email.showInfo());
        
        // Ask if the user wants to change the password
        System.out.println("Do you want to change the password? (1: YES, 2: NO)");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        if (choice == 1) {
            System.out.println("Enter the new password:");
            String newPassword = sc.nextLine();
            email.changPassword(newPassword);
            System.out.println("Password changed successfully.");
        }

        // Display updated info
        System.out.println(email.showInfo());

        // Close the scanner
        sc.close();
    }
}
