import  java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Name of Student:" );
          String name = sc.next();
        System.out.println("Enter the Name of age:" );
        int age = sc.nextInt();
        System.out.println("Enter the Name of gpa:" );
         float gpa = sc.nextFloat();
        
        System.out.println("Name of Student:"+ name );
        System.out.println("Student age:"+ age );
        System.out.println("Student gpa:"+gpa );
        sc.close();
    }
}