
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDelete {

    static void studentDelete(ArrayList<Student> studentlist) {
		System.out.println();
		System.out.println("**********Delete Student************");
		System.out.println("Enter Student id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		studentlist.remove(id-1);
		System.out.println("Delete Student Successfully !!!");
	}
	
}
