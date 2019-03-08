/*
 Author: Kim Tien Nguyen	Date: 1/21/2019
 Course: CSCI 1082.90		Assignment: PA1
 Purpose: To prompt for information and create a banking account.
 	Also, the program asks for initial balance, deposit, and 2 times of withdrawals.
 	After calculating final balance, the program calculates the amounts of bills.
 Pseudocode:
 Import packages: NumberFormat, Scanner, Locale
 Create class BankAccount
 	Define and initialize variables
 	Create object keyboard to get inputs from user
 	Create object moneyFormat to format money as US dollar.
 	Ask for input and check for validation of following variables:
 		name, address, city, state, 
 		zipcode (must have 5 digits): calculate the length of a number transferred to a string,
 		SSN (must be in form 111-11-1111): check if the character at index 3 and 6 is '-'
 			If it's valid, store in variables respectively
 			If it's invalid, use while loop to display error message, and ask for input again.
 	Ask for initial balance and store in "money"
 	Ask for deposit amount and store in variable "deposit"
 	Ask for first withdrawal amount, and store in "withdraw1st"
 		if withdraw1st > (deposit + money), display error message and exit program
 	similarly to second withdrawal
 		if withdraw2nd > (money + deposit - withdraw1st), exit. 
 	Calculate the final balance:
 		balance = money + deposit - withdraw1st - withdraw2nd
 	Declare and initialize bills to integers with value of 0
 	Bills 100: _100 = (int)balance / 100
 	Balance after subtracting total amount of bills 100 from balance: bl1
 	Bills 20: _20 = bl1 / 20
 	Balance after subtracting total amount of bills 20 from bl1: bl2
 	Bills 10: _10 = bl2 / 10
 	Balance after subtracting total amount of bills 10 from bl2: bl3
 	Bills 5: _5 = bl3 / 5
 	Balance after subtracting total amount of bills 5 from bl3: bl4
 	The value of bl4 is amount of bills 1 because:
 	Bills 1: _1 = bl4 / 1 = bl4
 	Display all information by using printf
 		All money values are formatted into US Locale
 */

//Import packages
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount 
{
	public static void main (String [] args) 
	{
		//Define variables
		String name, address, city, state, ssn;
		int zip;
		double money, deposit, withdraw1st, withdraw2nd, balance;
		
		//Create objects
		Scanner keyboard = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		
		keyboard.close();
		System.out.println("Welcome to CS Bank.\nTo open a checking account,"
				+ " please provide us with the following information:");
		
		//Ask for name
		System.out.print("Full Name: ");
		name = keyboard.nextLine();
		
		//Check if it's an empty string
		while (name.equals(""))
		{
			System.out.println("^^^ Full name can NOT be empty! Try again! ^^^");
			System.out.print("Full Name: ");
			name = keyboard.nextLine();
		}
		
		//Ask for street address
		System.out.print("Street Address: ");
		address = keyboard.nextLine();
		
		//Check if it's an empty string
		while (address.equals(""))
		{
			System.out.println("^^^ Street Address can NOT be empty! Try again! ^^^");
			System.out.print("Street Address: ");
			address = keyboard.nextLine();
		}
		
		//Ask for city
		System.out.print("City: ");
		city = keyboard.nextLine();
		
		//Check if it's an empty string
		while (city.equals(""))
		{
			System.out.println("^^^ City can NOT be empty! Try again! ^^^");
			System.out.print("City: ");
			city = keyboard.nextLine();
		}

		//Ask for state
		System.out.print("State: ");
		state = keyboard.next();
		
		//Check if it's an empty string
		while (state.equals(""))
		{
			System.out.println("^^^ State can NOT be empty! Try again! ^^^");
			System.out.print("State: ");
			state = keyboard.next();
		}
		
		//Ask for zipcode
		System.out.print("Zipcode (must be 5 digits): ");
		zip = keyboard.nextInt();
		int length = String.valueOf(zip).length(); //Calculate the length of number
		
		//Check if number has 5 digits
		while (length != 5)
		{
			System.out.println("^^^ Zipcode must be 5 digits! Try again! ^^^");
			System.out.print("Zipcode: ");
			zip = keyboard.nextInt();
			length = String.valueOf(zip).length(); //update
		}

		//Ask for SSN
		System.out.print("SSN (e.g., 111-11-1111): ");
		ssn = keyboard.next();
		
		//Declare variables and initialize value of 3th and 6th character to them
		char symbol1 = ssn.charAt(3), 
			 symbol2 = ssn.charAt(6);
		
		//Check if the 3th and 6th character of input is '-'
		while (symbol1 != '-' && symbol2 != '-')
		{
			System.out.println("^^^ SSN must be in this format 111-11-1111! ^^^");
			System.out.print("SSN: ");
			ssn = keyboard.next();
			//Update
			symbol1 = ssn.charAt(3);
			symbol2 = ssn.charAt(6);
		}
		
		//Ask for initial balance
		System.out.print("\n>---------------------------------------------------------<\n"
				+ "\tCongratulations! Your account is now ready!\n"
				+ ">---------------------------------------------------------<\n"
				+ "How much money do you want to add to your account? $");
		money = keyboard.nextDouble();
		
		//Ask for deposit
		System.out.print("Amount to deposit: $");
		deposit = keyboard.nextDouble();
		
		//Ask for first withdrawal
		System.out.print("First amount to withdraw: $");
		withdraw1st = keyboard.nextDouble();
		//Check if it is greater than the available balance for withdrawing
		if (((money + deposit) - withdraw1st) < 0)
		{
			//If not, display error message
			System.out.print("Insufficient balance!!!");
			System.exit(0); //Exit program
		}
		
		//Ask for second withdrawal
		System.out.print("Second amount to withdraw: $");
		withdraw2nd = keyboard.nextDouble();
		//Check if it is greater than the available balance for withdrawing 
		if (((money + deposit) - (withdraw1st + withdraw2nd)) < 0)
		{ 
			//If not, display error message
			System.out.print("Insufficient balance!!!");
			System.exit(0); //Exit program
		}
		
		//Calculate final balance
		balance = (money + deposit) - (withdraw1st + withdraw2nd);
				
		//Declare and initialize bills
		int _100 = 0, _20 = 0, _10 = 0, _5 = 0, _1 = 0;
				
		//Calculate $100 bills
		int bl = (int) balance;
		_100 = bl / 100;
		
		//Calculate $20 bills
		int bl1 = bl- _100 * 100;
		_20 = bl1 / 20;
				
		//Calculate $10 bills
		int bl2 = bl1 - _20 * 20;
		_10 = bl2 /10;
				
		//Calculate $5 bills
		int bl3 = bl2 - _10 * 10;
		_5 = bl3 / 5;
				
		//Calculate $1 bills
		int bl4 = bl3 - _5 * 5;
		_1 = bl4;
				
		//Display Information
		System.out.print("\n************************************\n"
				+ "\tAccount Information\n"
				+ "************************************\n"
				+ "Profile:\n");
		System.out.println("--------------- -------------------- -------------------- "
				+ "-------------------- -------  -------------");
		System.out.printf("%-15s|%-20s|%-20s|%-20s|%-7s |%-13s%n", "Full Name","Address","City",
				"State","Zipcode","SSN");
		System.out.println("--------------- -------------------- -------------------- "
				+ "-------------------- -------  -------------");
		System.out.printf("%-15s %-20s %-20s %-20s %-7d  %-13s%n", name, address, city, state, zip, ssn);
		System.out.println("--------------- -------------------- -------------------- "
				+ "-------------------- -------  -------------");	
		System.out.print("************************************\n"
				+ "Account Summary:\n");
		System.out.printf("%20s%15s%n%20s%15s%n%20s%15s%n%20s%15s%n%20s%15s%n",
				"Initial Balance:", moneyFormat.format(money),
				"First Withdrawal:", moneyFormat.format(withdraw1st),
				"Second Withdrawal:", moneyFormat.format(withdraw2nd),
				"Deposit:", moneyFormat.format(deposit),
				"Current Balance:", moneyFormat.format(balance)); //Format money to US Dollar
		System.out.println("************************************\n"
				+ "Bills count:");
		System.out.printf("%20s%7d%n%20s%7d%n%20s%7d%n%20s%7d%n%20s%7d", "$100 Bills:", _100,
				"$20 Bills:", _20, "$10 Bills:", _10, "$5 Bills:", _5, "$1 Bills:", _1);	
	}
}
