import java.util.Scanner;
public class Loop2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		String con;
		
		do{
		
		System.out.print("Enter num: ");
		num = s.nextInt();
		while (num > 0 ){
		System.out.println(num);
		num--;
	}
	System.out.print("Try Again Y/N?");
	 con = s.next().toUpperCase();
	}while(con.equals("Y"));

	}

}
