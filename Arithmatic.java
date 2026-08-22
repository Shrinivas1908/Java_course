import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First num:" );
        int a = sc.nextInt();
        System.out.println("Enter the Second num:" );
        int b = sc.nextInt();

        int c =( a + b);
        System.out.println("Sum of two number is :"+ c);
        sc.close();
    }
}
