
public class Stars {

	
	public static void main(String[] args) {
		
		int i, j, num = 4, row = 5;
		System.out.println("1.");
		for( i = 0; i < num;i++){
				System.out.println("**********");
			}
			System.out.println("");
		
			System.out.println("2.");
		for (i = 0; i <= num;i++){
			for(j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("3.");
		for(i = 0; i <= row;i++){
			for(j = 1 * (row - i) ; j >= 0 ; j--){
				System.out.print(" ");
			}
			for( j = 0; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println();
		
			}
		System.out.println("4.");
		for(i = 1; i <= row;i++){
			for(j = i ; j < 5; j++){
				System.out.print(" ");
			}
			for( j = 1; j < (i*2) ; j++){
				System.out.print("*");
			}
			System.out.println();
		
			}
		}
		
	}


