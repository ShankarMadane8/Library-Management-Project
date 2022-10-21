
import java.util.Scanner;

public class Signup {


 public void signup(Adminlog[] adminDatabase){
    System.out.println();
    System.out.println("**********Signup Form**********");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter User Name:-");
    String adminId =sc.nextLine();
    System.out.println("Enter Passwd:-");
    String adminpass =sc.nextLine();
    
    Adminlog obj1=new Adminlog(adminId, adminpass);
    adminDatabase[0]=obj1; 
    
  }

}
