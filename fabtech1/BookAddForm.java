
import java.util.Scanner;
import java.util.ArrayList;
public class BookAddForm {
  

  void addBooksForm(ArrayList<Book> booksList){
    System.out.println();
    System.out.println("**********Add Books Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Author Name:-");
    String Author =sc.nextLine();
    
    System.out.println("Enter Book Name :-");
    String BookName =sc.nextLine();
    
    Book obj1=new Book(Author, BookName);
    booksList.add(obj1);
    
  }

}
