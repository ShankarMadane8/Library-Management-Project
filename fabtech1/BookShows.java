
import java.util.ArrayList;

public class BookShows {

  public void bookShows(ArrayList<Book> booksList) {
    System.out.println();
    System.out.println("************* Show Books *************");
    int id = 1;
    System.out.println("id\t\tAuthor\t\tBook Name");

    for (Book book : booksList) {
      System.out.println(+id + ")\t\t" + book.getAuthor() + "\t\t" + book.getBookName());
      id++;
    }
  }

}
