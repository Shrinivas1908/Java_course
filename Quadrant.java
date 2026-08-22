import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int x = sc.nextInt();

        System.out.println("Enter the Second number:");
        int y = sc.nextInt();


        if ((x>0)&&( y>0)){
            System.out.println("Its in 1st Quadrant");
        }
        if ((x<0)&&( y>0)){
            System.out.println("Its in 2nd Quadrant");
        }
        if ((x<0)&&( y<0)){
            System.out.println("Its in 3rd Quadrant");
        }
        if ((x>0)&&( y<0)){
            System.out.println("Its in 4th Quadrant");
        }
    sc.close();
    }
}
