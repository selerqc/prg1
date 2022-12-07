package practice;
import java.util.Scanner;
public class Loop1 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      int number;
	  	String answer;
	     int x=1;

				do	{
				System.out.print("Enter Number: ");
				
				number =s.nextInt();
				

				while(x<=number){
				System.out.print(x);
					x++;
				}
				
				System.out.println(" ");
				System.out.print("Try again? Y/N: ");
				answer =s.next().toUpperCase();
				x=1;
				}while (answer.equals("Y"));
				
				
				{

}
	}

}
