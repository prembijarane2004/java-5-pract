import java.rmi.*;  
public interface PalindromeInterface extends Remote {     boolean 
isPalindrome(String input) throws RemoteException;  
}
