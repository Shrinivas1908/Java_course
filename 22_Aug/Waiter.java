import java.util.Scanner;

public class Waiter {

    static void waiter() {
        String waiter_name = "Sham";
        System.out.println("Name of Waiter is: " + waiter_name);
    }

    void bill(double amount, int rating) {

        double tip = 0;
        switch (rating) {
            case 1:
                tip = amount * 0.05;
                break;

            case 2:
                tip = amount * 0.10;
                break;

            case 3:
                tip = amount * 0.15;
                break;

            case 4:
                tip = amount * 0.20;
                break;
            
            case 5:
                tip = amount * 0.25;
                break;    

            default:
                System.out.println("Invalid rating");
                return;
        }

        double totalBill = amount + tip;

        System.out.println("Bill Amount: " + amount);
        System.out.println("Tip: " + tip);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        waiter();

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the rating (1-5): ");
        int rating = sc.nextInt();

        Waiter obj = new Waiter();

        obj.bill(amount, rating);

        sc.close();
    }
}
