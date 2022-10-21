
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsRecord {
 Scanner sc =new Scanner(System.in);
  
 
 
 //----------------------------------
 
 
 
  StudentAddForm obj=new StudentAddForm();

  void addStudent(ArrayList<Student> studentList) {
    
    while (true){
      obj.studentAddForm(studentList);
      String flag="no";
      System.out.println("Add Student Successflly !!!");
      System.out.println("add one more student (yes/no): ");
      String choose=sc.next();

      if (choose.equals(flag)){
          studentRecord(studentList);
          break;
      }
      
    }
  }


  StudentShows obj1=new StudentShows();
  
  
  
  
  
//----------------------------------------
  
  
  
  
  void studentRecord(ArrayList<Student> studentList) {
    
    System.out.println();
    System.out.println("*********** Student Management ***********");
    System.out.println("1.Add Student");
    System.out.println("2.Show Student");
    System.out.println("3.Delete Student");
    System.out.println("4.Back");
    System.out.println("Enter your option");
    int a = sc.nextInt();
    switch (a) {
      case 1:addStudent(studentList);
      studentRecord(studentList);
        break;

      case 2:obj1.studentShow(studentList);
        studentRecord(studentList);
        break;

      case 3:StudentDelete.studentDelete(studentList);
        studentRecord(studentList);
        break;

      case 4:;
        break;

      default:
        break;
    }
  }




}
