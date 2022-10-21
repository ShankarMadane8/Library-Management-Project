
import java.util.ArrayList;
import java.util.Scanner;

public class Adminlog {

    Scanner sc = new Scanner(System.in);   
   private String adminId;
   private String adminpass;
    
    public Adminlog(String adminId, String adminpass) {
        this.adminId = adminId;
        this.adminpass = adminpass;
    }
    
    public Adminlog() {
       
    }




 //---------------- dash board ---------------------------





static ArrayList<Student>  studentList = new ArrayList<>();
static ArrayList<Book> booksList= new ArrayList<>();

 static void dashboard(){
    Scanner sc = new Scanner(System.in); 
    System.out.println();
    System.out.println("*********** Welcome To the Library ***********");
    System.out.println("1.Students Record");
    System.out.println("2.Book Records");
    System.out.println("3.Manage Books");
    System.out.println("4.logout");
    System.out.println("Enter your option");
    int a=sc.nextInt();
    BookRecords obj=new BookRecords();
    StudentsRecord obj1=new StudentsRecord();
    switch (a) {
        case 1:obj1.studentRecord(studentList);
            Adminlog.dashboard();
            break;
        
        case 2:obj.Librarydisplay(booksList);
            Adminlog.dashboard();
            break;
        
        case 3:
            break;   
        
        case 4:
            break;    

        default:
            break;
    }
}







//----------------Login Form-------------------------------








    BookRecords obj=new BookRecords();
    StudentsRecord obj1=new StudentsRecord();
    public void loginForm(Adminlog[] adminDatabase){
        System.out.println();
        System.out.println("************* Login page *************");
        System.out.println("Enter User Name:-");
        String adminId =sc.next();

        System.out.println("Enter Password:-");
        String adminpass =sc.next();
        
        if (adminDatabase[0]==null){
            System.out.println("Incorrect id or Password Try again. (--- please signup first ---) ");
        }
            
        else if (adminDatabase[0].adminId.equals(adminId) && adminDatabase[0].adminpass.equals(adminpass)) {
            System.out.println("Login Successful !!!");
            dashboard();
        } 
        else {
            System.out.println("Incorrect id or Password Try again. ");
        }
    }


}
