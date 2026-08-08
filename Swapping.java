import  java.util.Scanner;
 
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First num:" );
        int a = sc.nextInt();
        System.out.println("Enter the Second num:" );
        int b = sc.nextInt();

        System.out.println("Before Swapping:"+ " a:" +a +", b:"+b );

       int temp =a ;       
        a = b;
        b = temp;
        System.out.println("After Swapping:" + " a:" + a + ", b: " + b);

        sc.close();
    }
}
