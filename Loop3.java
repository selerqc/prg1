import java.util.Scanner;
public class Loop3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x, i = 2;
		String con;
		
		do{
			System.out.print("Enter Num: ");
			x =s.nextInt();
			
			while(i <= x){
				System.out.println(i);
				i++;
				i+=1;
				
		}System.out.print("Try Again Y/N?");
		con = s.next().toUpperCase();
		}while(con.equals("Y"));
		
	}

}
