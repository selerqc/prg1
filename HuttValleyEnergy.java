import java.util.Scanner;
public class HuttValleyEnergy {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double kilowattHours;
		double totalCharge =0 ;
		
		System.out.print("Enter meter reading: ");
		kilowattHours = s.nextInt();
		
		if(kilowattHours <= 500){
			totalCharge = 10;
			
		}else if(kilowattHours >= 501 && kilowattHours < 1000 ){
			totalCharge = 10 + (kilowattHours - 500) * 0.05;
	
		
		}else if(kilowattHours > 1000){
			totalCharge = 35 + (kilowattHours - 1000) * 0.03;
		}
		System.out.println("Total Cost is: " + totalCharge);
	}
}