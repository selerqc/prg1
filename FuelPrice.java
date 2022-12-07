import java.util.Scanner;
public class FuelPrice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double cost;
		double liters;
		
		
		System.out.println("[1]Super XCS ");
		System.out.println("[2]Diesoline ");
		System.out.println("[3]Diesel ");
		System.out.println("[4]Regular");
		System.out.println("[5]Gas ");
		
		System.out.print("Enter Gas of Choice: ");
		int gas = s.nextInt();
		System.out.print("Enter Number Of liters: ");
		 liters = s.nextDouble();

		if (gas == 1){
			cost = liters * 68.75;
			System.out.println("Total cost: " + cost);
		}else if(gas == 2){
			cost = liters * 87.25;
			System.out.println("Total cost: " + cost);
		}else if(gas == 3){
			cost = liters * 86.50;
			System.out.println("Total cost: " + cost);
		}else if(gas == 4){
			cost = liters * 65.50;
			System.out.println("Total cost: " + cost);
		}else if(gas == 5){
			cost = liters * 64.75;
			System.out.println("Total cost: " + cost);
		}else{
			System.out.println("Invalid Number");
		}
	}

}
