import java.util.Scanner;
public class Remainders {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String loop;
		
		do{
			int num,i = 1;
			System.out.print(" Enter Positive Integers: ");
			num = s.nextInt();
			
			while(i <= num ){
				i++;
				if( i % 3 == 1 && i % 4 == 2  && i % 5 == 3 && i % 6 == 4)
					System.out.print(" " +i);
					
				}System.out.println("Try Again Y/N?");
				loop = s.next().toUpperCase();
				}while(loop.equals("Y"));
			
		}
}
 