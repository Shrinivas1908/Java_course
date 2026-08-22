import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:" );
        int a = sc.nextInt();
    
       if (a % 2 == 0){
        System.out.println("Its  even number");
       
       }
        else{
         System.out.println("Its odd number");
    }
        sc.close();
    }
    
}
