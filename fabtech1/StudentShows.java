
import java.util.ArrayList;

public class StudentShows {
  
  public void studentShow(ArrayList<Student> studentList) {
    System.out.println();
    System.out.println("************* Show Student *************");
    int id=1;

    System.out.println("id\t\tname\t\tRoll No\t\tLibrary id");
    for(Student student:studentList){
      
       if (student==null){
        System.out.println("null\t\tnull\t\tnull\t\tnull");
        break;   
       }
       else{
        System.out.println(id+")\t\t"+student.getName()+"\t\t"+student.getRole_no()+"\t\t"+student.getLibrary_id());
        id++;
       }
     
    }

    
  }
}
