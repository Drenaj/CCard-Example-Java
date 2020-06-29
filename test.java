package creditcard;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter card number:");
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int n3 = kb.nextInt();
        int n4 = kb.nextInt();
        int month = kb.nextInt();
        int year = kb.nextInt();
        
        CreditCard card = new CreditCard(n1, n2, n3, n4, month, year);
        System.out.println("Enter year:");
        int y = kb.nextInt();
        System.out.println("Enter month:");
        int m = kb.nextInt();
            if (card.isValid(y, m))
                System.out.println("Card is valid.");
        
    }
    
}
