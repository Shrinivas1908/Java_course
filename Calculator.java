import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle Amount:" );
        float p = sc.nextFloat();
        System.out.println("Enter the Rate of Interest:" );
        float r = sc.nextFloat();
        System.out.println("Enter the Time:" );
        int t = sc.nextInt();

        float si = (p*r*t)/100;
        int ci = (p*(1 + r/100)^t - p );
    }
}