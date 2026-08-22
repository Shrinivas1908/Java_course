import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount:");
        double p = sc.nextDouble();

        System.out.println("Enter the Rate of Interest:");
        double r = sc.nextDouble();

        System.out.println("Enter the Time:");
        int t = sc.nextInt();

       
        double si = (p * r * t) / 100;
      
        double ta = p * Math.pow((1 + r / 100), t);

        double ci = ta - p;
        
        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
        System.out.println("Total Amount = " + ta);
        sc.close();
    }
}
