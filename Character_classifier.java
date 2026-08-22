import java.util.Scanner;

public class Character_classifier {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);

        int av = (int) ch; 
        if((ch == 97)||(ch == 101)||(ch == 105)||(ch == 111)||(ch == 117)){
            System.out.println("Its vowel");
        }
        else if (av >= 48 && av <= 57) {
        System.out.println(ch + " Its a digit.");    
        }
        else {
            System.out.println("Its Consonat");
        }
        sc.close();
    }
}


    
