import java.util.Scanner;
public class QuetelexIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double height ,weight;
		double bmi = 0;
		
		System.out.print("Enter Height: ");
		height = s.nextFloat();
		
		System.out.print("Enter Weight: ");
		 weight = s.nextFloat();
		 
		 bmi =  (weight)/(height*height);
		 
		 System.out.println("Quetelet Index " + bmi);
		 
		 if (bmi< 20){
			 System.out.println("Reamrks is Underweight");
		 }else if (bmi > 20 && bmi < 25){
			 System.out.println("Remarks is Healthy Weight");
		 }else if (bmi > 25 && bmi <30 ){
			 System.out.println("Remarks is Mildly Overweight");
		 }else if (bmi > 30 && bmi < 40){
			 System.out.println("Remarks is Very Overweight");
		 }else if (bmi > 40){
			 System.out.println("Remarks is Extremely Overweight");
		 }
	}

}
