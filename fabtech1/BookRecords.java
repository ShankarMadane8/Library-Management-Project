
import java.util.Scanner;
import java.util.ArrayList;
public class BookRecords {


  

  BookAddForm objAddBook=new BookAddForm();
    
  
  void callAddBooksForms(ArrayList<Book> booksList){
      Scanner obj=new Scanner(System.in);
   
      while (true){
        objAddBook.addBooksForm(booksList);
          String flag="no";
          System.out.println("Add Book Successflly !!!");
          System.out.println("add one more book (yes/no): ");
          String choose=obj.nextLine();
          
          if (choose.equals(flag)){
              
              break;
          }
          
      }
        
}

   BookShows objbook=new BookShows(); 


//----------------------------


void Librarydisplay(ArrayList<Book> booksList){
  Scanner sc=new Scanner(System.in);
  System.out.println();
  System.out.println("*********** Welcome To the Library ***********");
          System.out.println("1.Add Books");
          System.out.println("2.Show Books");
          System.out.println("3.Delete Book");
          System.out.println("4.Back");
          System.out.println("Enter your option");
          int a=sc.nextInt();
          switch (a) {
              case 1:callAddBooksForms(booksList);
                  Librarydisplay(booksList);
                  break;
              
              case 2:objbook.bookShows(booksList);
                 Librarydisplay(booksList);
                  break;
              
              case 3:BookDelete.bookDelete(booksList);
                  Librarydisplay(booksList);
                  break;   
               
              case 4:
            	  break;
                  
              default:
                  break;
          }
}
  
}
