import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class PalindromeImpl extends UnicastRemoteObject implements PalindromeInterface {

    protected PalindromeImpl() throws RemoteException {
        super();
    }

    public boolean isPalindrome(String input) throws RemoteException {
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        return cleanInput.equals(reversed);
    }
}
