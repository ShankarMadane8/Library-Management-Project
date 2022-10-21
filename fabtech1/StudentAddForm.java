
import java.util.ArrayList;
import java.util.Scanner;

public class StudentAddForm {

  

  void studentAddForm(ArrayList<Student> studentList){
    System.out.println();
    System.out.println("**********Add Student Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Student Name:-");
    String name =sc.nextLine();
    
    System.out.println("Enter Student Role_no :-");
    int Role_no =sc.nextInt();

    System.out.println("Enter Student Library_id :-");
    int Library_id =sc.nextInt();

    Student obj1=new Student(name, Role_no, Library_id);
    studentList.add(obj1);
    
  }

}
