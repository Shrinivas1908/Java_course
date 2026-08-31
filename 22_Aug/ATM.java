import java.util.*;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean access = false;

        int currentBalance = 100;
        int savingBalance = 200;

        System.out.println("Enter your card number:");
        int card = sc.nextInt();

        if (card > 999 && card < 10000) {
            access = true;
            System.out.println("Access Granted!");
        } else {
            System.out.println("Invalid Card Number!");
        }

        while (access == true && attempts < 3) {

            System.out.println("\nChoose action:");
            System.out.println("1 - Transfer from Current to Saving Account");
            System.out.println("2 - Transfer from Saving to Current Account");
            System.out.println("3 - Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                savingBalance += currentBalance;
                currentBalance = 0;

                System.out.println("Amount transferred to Saving Account.");

            } 
            else if (choice == 2) {

                currentBalance += savingBalance;
                savingBalance = 0;

                System.out.println("Amount transferred to Current Account.");
            } 
            else if (choice == 3) {
                System.out.println("Have a Good Day!");
                break;
            } 
            else {
                System.out.println("Invalid Choice!");
            }

            System.out.println("Current Balance = " + currentBalance);
            System.out.println("Saving Balance = " + savingBalance);

            attempts++;
        }

        System.out.println("Thank you for using ATM.");

        sc.close();
    }
}
