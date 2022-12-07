import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double kiloWatt = 0, presentReading,previousReading,AmountDue = 0;
		int choice;
		System.out.println("Building code: ");
		System.out.println("1: Residential");
		System.out.println("2: Commercial");
		System.out.println("3: Industrial");
			choice = s.nextInt();
		System.out.println("Enter Present Reading: ");
		presentReading = s.nextDouble();
		System.out.println("Enter Previous Reading: ");
		previousReading = s.nextDouble();
		
		kiloWatt = presentReading - previousReading;
		
		switch(choice){
		case 1:
			if(kiloWatt <= 50){
				AmountDue = 27;
			}else if(kiloWatt > 51 && kiloWatt <100){
				AmountDue = 27 + (kiloWatt - 50) * 0.75;
			}else if(kiloWatt > 101 && kiloWatt < 150){
				AmountDue = 27 + (kiloWatt - 100) * 3.50;
			}else if (kiloWatt > 151){
				AmountDue =  27 + (kiloWatt -150) * 5.50;
			}
			break;
			
		case 2:
			if(kiloWatt <= 50){
				AmountDue = 35;
			}else if(kiloWatt > 51 && kiloWatt <100){
				AmountDue = 35 + (kiloWatt - 50) * 0.75;
			}else if(kiloWatt > 101 && kiloWatt < 150){
				AmountDue = 35 + (kiloWatt - 100) * 3.50;
			}else if (kiloWatt > 151){
				AmountDue =  35 + (kiloWatt -150) * 5.50;
			}
			break;
		case 3:
			if(kiloWatt <= 50){
			AmountDue = 52;
			}else if(kiloWatt > 51 && kiloWatt <100){
			AmountDue = 52 + (kiloWatt - 50) * 0.75;
			}else if(kiloWatt > 101 && kiloWatt < 150){
			AmountDue = 52 + (kiloWatt - 100) * 3.50;
			}else if (kiloWatt > 151){
			AmountDue =  52 + (kiloWatt -150) * 5.50;
			}
			break;
		}
		System.out.println("Amount Due: " + AmountDue);
		
	}

}
