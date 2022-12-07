import java.util.Scanner;
public class CarRentall {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int typeInsurance = 0,typeOfCar,numDays,miles;
		double dailyCharge,mileageCharge,totalMileage,total = 0,cost;
		
		System.out.println("Car Type[1]		Car Type[2]		Car Type[3] ");
		System.out.println("Enter Type of Car: ");
		typeOfCar = s.nextInt();
		
		System.out.print("Enter Number of Days: ");
		numDays = s.nextInt();
		
		System.out.print("Enter miles travelled: ");
		miles = s.nextInt();
		
		System.out.print("Enter Insurance Type: ");
		typeInsurance = s.nextInt();
		
		switch(typeOfCar){
		
		case 1:
			
			if(typeInsurance == 1){
			dailyCharge = numDays * 8;
			totalMileage = miles * 0.06;
			total = dailyCharge + totalMileage;
			cost = (total *0.20) + total;
			System.out.println("Total Bill: " + cost);
			
			}else if(typeInsurance == 2){
			dailyCharge = numDays * 8;
			totalMileage = miles * 0.06;
			total = dailyCharge + totalMileage;
			cost = (numDays * 4) + total;
			System.out.println("Total Bill: " + cost);
		
			}
			break;
			case 2:
			
			if(typeInsurance == 1){
			dailyCharge = numDays * 10;
			totalMileage = miles * 0.08;
			total = dailyCharge + totalMileage;
			cost = (total *0.20) + total;
			System.out.println("Total Bill: " + cost);
			
			}else if(typeInsurance == 2){
			dailyCharge = numDays * 10;
			totalMileage = miles * 0.08;
			total = dailyCharge + totalMileage;
			cost = (numDays * 4) + total;
			
			System.out.println("Total Bill: " + cost);
			}
			break;
			case 3:
				
			if(typeInsurance == 1){
			dailyCharge = numDays * 15;
			totalMileage = miles * 0.06;
			total = dailyCharge + totalMileage;
			cost = (total *0.20) + total;
			System.out.println("Total Bill: " + cost);
				
			}else if(typeInsurance == 2){
			dailyCharge = numDays * 15;
			totalMileage = miles * 0.12;
			total = dailyCharge + totalMileage;
			cost = (numDays * 4) + total;
				
			System.out.println("Total Bill: " + cost);
			}
			break;
		}
	}

}
