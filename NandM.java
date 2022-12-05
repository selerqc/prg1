import java.util.Scanner;
public class NandM {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String val;
		int firstNum,secondNum;
	do{
		System.out.print("Enter start number: ");
		firstNum = s.nextInt();
		
		System.out.print("Enter Second Number: ");
		secondNum = s.nextInt();	
		
		if(firstNum < secondNum)
			for(int num = firstNum; num <= secondNum; num++ ){
			System.out.println(num);
			
		}else if( firstNum > secondNum){
			for(int num = firstNum ; num >= secondNum; num-- ){
			System.out.println(num);
			}

	}System.out.print("Try Again Y/N?");
	val = s.next().toUpperCase();
	}while(val.equals("Y"));
	}

}
