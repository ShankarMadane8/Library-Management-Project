

import java.util.ArrayList;
import java.util.Scanner;

public class BookDelete {

    static void bookDelete(ArrayList<Book> booksList) {
    	System.out.println();
		System.out.println("**********Delete Student************");
		System.out.println("Enter Book id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		booksList.remove(id-1);
		System.out.println("Delete Book Successfully !!!");
	}
}
