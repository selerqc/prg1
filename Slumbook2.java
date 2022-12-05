
import java.util.Scanner;
public class Slumbook2 {

	public static void main(String[] args) {
		
		//please do not input spaces :)
		System.out.println("ENTER YOUR CREDENTIALS");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firstName = s.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lastName = s.nextLine();
		 
		System.out.println("Enter Middle Name:");
		String middleName = s.nextLine();
		
		System.out.println("Enter Age: ");
		int age = s.nextInt();
		
		//format mm/dd/yy
		System.out.println("Enter Birthday: ");
		String bDay = s.next();
		
		//please do not input spaces :)
		System.out.println("Enter Address: ");
		String address = s.next();
		
		//input 10 digits of number
		System.out.println("Enter Contact Number: ");
		long contactNum = s.nextLong();
		
		//please do not input spaces :)
		System.out.println("Enter Motto: ");
		String motto = s.next();
		
		System.out.println("");
		
		System.out.println("Enter Food: ");
		String food = s.next();
		
		System.out.println("Enter Favorite Color: ");
		String color = s.next();
		
		//please do not input spaces :)
		System.out.println("Enter Favorite Song: ");
		String song = s.next();
		
		//please do not input spaces :)
		System.out.println("Enter Favorite Movie: ");
		String movie = s.next();
		
		//please do not input spaces :)
		System.out.println("Describe Yourself: ");
		String describeSelf = s.next();
		
		System.out.println("");
		
		System.out.println("ABOUT ME");
		
		System.out.println("Hello "  + firstName +" "+ middleName +" "+ lastName);
		System.out.println("You're " + age + "years old");
		System.out.println("Born on " + bDay);
		System.out.println("Address is " + address );
		System.out.println("Contact Number: " + contactNum);
		System.out.println("Motto: " + motto);
		
		System.out.println("");
		System.out.println("FAVORITES");
		
		System.out.println("Favorite Food is " + food);
		System.out.println("Favorite Color is " + color);
		System.out.println("Favorite Song is " + song);
		System.out.println("Favorite Movie is " + movie);
		System.out.println("About Yourself " +describeSelf);
		System.out.println("");
		
	}

}
