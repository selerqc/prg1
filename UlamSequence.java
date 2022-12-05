import java.util.Scanner;
public class UlamSequence {
	public static void main(String[] args) {
		
		int n;
		String val;
		
		do{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Number: ");
			n = s.nextInt();
			
		while(n!= 1){
			 if( n % 2 == 0){
				 n = n/2;
			
				 
			 }else if (n % 2 == 1){
				 n = 3 * n + 1;
				
			 }
			 System.out.println(n);
			 
		}System.out.print("Try Again Y/N?");
				val = s.next().toUpperCase();
				}while(val.equals("Y"));
		
		 
			
		}

	}


