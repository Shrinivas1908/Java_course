import java.util.Scanner;

public class Relational_and_operational {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First num:" );
        float a = sc.nextFloat();
        System.out.println("Enter the Second num:" );
        float b = sc.nextFloat();
        System.out.println("Enter the Third num:" );
        float c = sc.nextFloat();


        if ((a>0)&&(b>0)&&(c>0)){
            System.out.println("Numbers are : " + "a:" + a + ", b: " + b + ", c :" + c);
       
       }
        else if((a % 2 == 0)||(b % 2 == 0)||(c % 2 == 0)){
            System.out.println("Numbers are : " + "a:" + a + ", b: " + b + ", c :" + c);
    }
        else if((a!=0)&&(b!=0)&&(c!=0)){
            System.out.println("Numbers are : " + "a:" + a + ", b: " + b + ", c :" + c);

        }
        sc.close();
    }
}
    

