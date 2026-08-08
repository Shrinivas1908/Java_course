import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First num:" );
        int a = sc.nextInt();
        System.out.println("Enter the Second num:" );
        int b = sc.nextInt();

       if ((a == 0)  || (a<b)){
        System.out.println("Greater number is :"+b);
       
       }
        else{
         System.out.println("Greater number is :"+a);
    }
        sc.close();
    }
}
