import java.util.Scanner;

public class LibraryReturn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBooks = 0;
        double totalFine = 0;
        String overdueList = "";

        char more;

        final double FINE_PER_DAY = 5.0;

        do {
            System.out.print("\nBook ID: ");
            String bookId = sc.next();

            System.out.print("Due date (day): ");
            int due = sc.nextInt();

            System.out.print("Return date (day): ");
            int returned = sc.nextInt();

            totalBooks++;

            int daysDiff = returned - due;

            if (daysDiff < 0) {

                System.out.println("Early return! Thank you for " + bookId);

            } else if (daysDiff == 0) {

                System.out.println("Returned on time: " + bookId);

            } else {

                double fine = daysDiff * FINE_PER_DAY;

                totalFine += fine;

                overdueList += bookId + " (" + daysDiff + " days), ";

                System.out.println("Overdue! Fine for " + bookId
                        + ": Rs." + fine);
            }

            System.out.print("Process another book? (Y/N): ");
            more = sc.next().toUpperCase().charAt(0);

        } while (more == 'Y');

        System.out.println("\n=== Return Summary ===");
        System.out.println("Books processed: " + totalBooks);
        System.out.println("Total fine: Rs." + totalFine);

        if (!overdueList.isEmpty()) {

            System.out.println("Overdue books: "
                    + overdueList.substring(0, overdueList.length() - 2));

        } else {

            System.out.println("Overdue books: None");
        }

        sc.close();
    }
}