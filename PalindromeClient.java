import java.rmi.*;  
  
public class PalindromeClient {     public 
static void main(String[] args) {         try {  
            PalindromeInterface obj = (PalindromeInterface)  
Naming.lookup("rmi://localhost/PalindromeService");  
  
            java.util.Scanner scanner = new java.util.Scanner(System.in);  
            System.out.print("Enter a string or number: ");  
            String input = scanner.nextLine();  
  
            boolean result = obj.isPalindrome(input);             
if (result)  
                System.out.println("It is a palindrome.");             
else  
                System.out.println("It is not a palindrome.");  
        } catch (Exception e) {  
            System.out.println("Client error: " + e);  
        }  
    }  
}
