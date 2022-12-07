import java.util.*;

public class Rock {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	 Random r = new Random();
	 
	 //0 = rock 1 = paper 2= scissors
	 
	 String user,computer;
	 int computerInt;
	 
	 System.out.print("Enter  r, p  or s: ");
	  user = s.next().toUpperCase();
	
	  computerInt = r.nextInt(3);
	  
	  switch(computerInt){
	  case 0:
		  System.out.println("Computer plays: Rock");
		  if(user.equals("R")){
			  System.out.println("Tie");
			  
		  }else if(user.equals("P")){
			  System.out.println("paper covers rock, you win");
		  }else if(user.equals("S")){
			  System.out.println("Rock crushes scissors, you lose");
		  }
		  break;
	  case 1:
		  System.out.println("Computer plays: paper");
		  if(user.equals("R")){
			  System.out.println("paper folds rock, you lose");
			  
		  }else if(user.equals("P")){
			  System.out.println("tie");
		  }else if(user.equals("S")){
			  System.out.println("scissors cuts paper");
		  }
		  break;
	  case 2:
		  System.out.println("Computer plays: scissors");
		  if(user.equals("R")){
			  System.out.println("rock crushes scissors, you ");
			  
		  }else if(user.equals("P")){
			  System.out.println("scissors cuts paper, you lose");
		  }else if(user.equals("S")){
			  System.out.println("tie");
		  }
		  break;
	  }
	 
	 
		 
	 }

	}

