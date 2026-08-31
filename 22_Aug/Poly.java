import java.util.Scanner;

public class Poly {

    void add(int a, int b) {
        System.out.println("Total of addition: " + (a + b));
    }

    void add(float a, float b) {
        System.out.println("Total of addition: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Total of addition: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data type (integer/float/double):");
        String data_type = sc.next();

        Poly obj = new Poly();

        if (data_type.equals("integer")) {
            System.out.println("Enter two integers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            obj.add(a, b);

        } else if (data_type.equals("float")) {
            System.out.println("Enter two float values:");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            obj.add(a, b);

        } else if (data_type.equals("double")) {
            System.out.println("Enter two double values:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            obj.add(a, b);

        } else {
            System.out.println("Invalid data type!");
        }
        sc.close();
    }
}