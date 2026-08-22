import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the income:" );
        int inc = sc.nextInt();

       if (inc <= 250000){
        System.out.println("No tax");
       }
       else if ((inc > 250000)&& (inc < 500000)){
        int amt = inc - (inc%5);
         System.out.println("5% tax"+ amt);
       }
       else if ((inc > 500000)&& (inc < 1000000)){
        int amt = inc  - (inc%20);
         System.out.println("20% tax"+ amt);
       }
        else {
         System.out.println("Wrong input");
        }
        sc.close();
    }
    
}
