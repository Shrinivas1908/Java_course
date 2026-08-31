import java.util.Scanner;
public class Supermarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;
        char choice;
        int count = 1;

        do {
            if (count == 1) {
                int biscuits = 10;
                System.out.println("Price of Biscuits: " + biscuits);
                total = total + biscuits;
            }
            else if (count == 2) {
                int chocolates = 30;
                System.out.println("Price of Chocolates: " + chocolates);
                total = total + chocolates;
            }
            else if (count == 3) {
                int chips = 20;
                System.out.println("Price of Chips: " + chips);
                total = total + chips;
            }
            count++;

        } while (count <= 3);
        // Ask customer for 4th item
        System.out.println("Do you want to add the 4th item? (Y/N)");
        choice = sc.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            System.out.println("Enter the name of the 4th item:");
            String new_item = sc.next();


            System.out.println("Enter the price of the:"+new_item);
            double fourthItem = sc.nextDouble();

            total = total + fourthItem;
            System.out.println("Price of 4th item: " + fourthItem);
        }
        System.out.println("Total bill = " + total);
       sc.close();
    }
}
