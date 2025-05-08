import java.rmi.*; import 
java.rmi.registry.*; import 
java.rmi.server.*;  
  
public class PalindromeServer {     public 
static void main(String[] args) {         try {  
            LocateRegistry.createRegistry(1099);  //Create internal registry  
  
            PalindromeImpl obj = new PalindromeImpl();  
            Naming.rebind("rmi://localhost/PalindromeService", obj);  
  
            System.out.println("Server is ready...");  
        } catch (Exception e) {  
            System.out.println("Server error: " + e);  
        }  
    }  
}
