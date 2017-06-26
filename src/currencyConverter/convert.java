package currencyConverter;
import java.util.*;

public class convert {
	public static double us_dollars;
	public static double can_dollars;
	static Scanner console = new Scanner(System.in);
	
	
	public static void ask(){
		
		
		System.out.println("How many US dollars would you like to exchange?");
		System.out.print("Enter a positive numerical value: $");
		
		boolean is_valid = console.hasNextInt();
		if (is_valid == true){
			double raw_input = console.nextDouble();
			
			if (raw_input <0){
				System.out.print("\nPlease enter a POSITIVE value.\n");
				ask();
			}
			
			else{
				us_dollars = raw_input;
				can_dollars = us_dollars*1.36;
				System.out.printf("You have %.2f",can_dollars);
				System.out.println(" Canadian dollars.");
			}
		}
		
		else{
			System.out.print("Please enter an integer value");
			ask();
		}
		
	}
	
	public static void simple(int amt){
		int hundred, fifty, twenty, ten, five, one;
		hundred = fifty = twenty = ten = five = one = 0;
		
		if (amt >= 100){
			hundred = amt/100;
			amt -= hundred*100;
		}
		
		if (amt >= 50){
			fifty = amt/50;
			amt -= fifty*50;
		}
		
		if(amt >= 20){
			twenty = amt/20;
			amt -= twenty*20;
		}
		
		if (amt >= 10){
			ten = amt/10;
			amt -= ten*10;
		}
		
		if (amt >= 5){
			five = amt/5;
			amt -= five*5;
		}
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("hundred x "+hundred);
		System.out.println("fifty   x "+fifty);
		System.out.println("twenty  x "+twenty);
		System.out.println("ten     x "+ ten);
		System.out.println("five    x "+ five);
		System.out.println("one     x "+ one);
		
	}
	
	public static void all_fifties(int amt){
		int fifty, twenty, ten, five, one;
		fifty = twenty = ten = five = one = 0;
		
		if (amt >= 50){
			fifty = amt/50;
			amt -= fifty*50;
		}
		
		if(amt >= 20){
			twenty = amt/20;
			amt -= twenty*20;
		}
		
		if (amt >= 10){
			ten = amt/10;
			amt -= ten*10;
		}
		
		if (amt >= 5){
			five = amt/5;
			amt -= five*5;
		}
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("fifty  x "+fifty);
		System.out.println("twenty x "+twenty);
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	
	public static void all_twenties(int amt){
		int twenty, ten, five, one;
		twenty = ten = five = one = 0;
		
		if(amt >= 20){
			twenty = amt/20;
			amt -= twenty*20;
		}
		
		if (amt >= 10){
			ten = amt/10;
			amt -= ten*10;
		}
		
		if (amt >= 5){
			five = amt/5;
			amt -= five*5;
		}
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("twenty x "+twenty);
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	
	public static void all_tens(int amt){
		int ten, five, one;
		ten = five = one = 0;
		
		
		if (amt >= 10){
			ten = amt/10;
			amt -= ten*10;
		}
		
		if (amt >= 5){
			five = amt/5;
			amt -= five*5;
		}
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);	
	}
	
	public static void all_fives(int amt){
		int five, one;
		five = one = 0;
		
		if (amt >= 1){
			five = amt/5;
			amt -= five*5;
		}
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	
	public static void all_ones(int amt){
		int one;
		one = 0;
		
		if (amt >= 1){
			one = amt/1;
			amt -= one*1;
		}
		
		System.out.println("one    x "+ one);
		
	}
	
	public static void receive(){
		System.out.println("1: simplest form\n"
						 + "2: all fifties\n"
						 + "3: all twenties\n"
						 + "4: all tens\n"
						 + "5: all fives\n"
						 + "6: all ones\n");
		System.out.print("Option number: ");
		boolean valid_option = console.hasNextInt();
		if (valid_option == false) {
			System.out.println("\n Please choose one of the options from below.\n");
			receive();
		}
		
		else{
			int change = console.nextInt();
			if (change == 1 || change == 2 || change == 3 || change == 4 || change == 5 || change == 6){
			
				if (change == 1)	simple((int)can_dollars);
				
				if (change == 2)	all_fifties((int) can_dollars);
				
				if (change == 3)	all_twenties((int) can_dollars);
				
				if (change == 4)	all_tens((int) can_dollars);
				
				if (change == 5) 	all_fives((int) can_dollars);
				
				if (change == 6)	all_ones((int) can_dollars);
			}
			
			else{
				System.out.println("\n Please choose one of the options from below.\n");
				receive();
			}
		}
	
		another_exchange();
	}
	
	public static void another_exchange(){
		System.out.print("Would you like to make another exchange?\n1 for yes or 2 for no: ");
			int one_or_two = console.nextInt();
			if (one_or_two == 1){
				ask();
				receive();
			}
			
			if (one_or_two == 2){
				System.out.println("Thank you. Good-bye.");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ask();
		System.out.println("How would you like that?\n");
		System.out.println("Select an option 1-6 then press ENTER.");
		receive();

	}

}
