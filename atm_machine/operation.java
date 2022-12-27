package atm_machine;

import java.util.Scanner;

public class operation implements option {
	
	Scanner menuInput=new Scanner(System.in);
	account c1=new account();
	
	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("1. Checking account");
		System.out.println("2. Saving account");
		System.out.println("3. Exit");
		System.out.print("= ");
		int selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using ATM");
			System.exit(0);
			break;
		default:
			System.out.println("\n"+"Invalid choice!"+"\n");
		}
	}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("1. View balance");
		System.out.println("2. Withdraw funds");
		System.out.println("3. Deposite funds");
		System.out.println("4. Exit");
		System.out.print("= ");
		int selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Balance: "+c1.getCheckingBalance()+"BDT");
			getAccountType();
			break;
		case 2:
			c1.getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			c1.getCheckingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using ATM");
			break;
		default:
			System.out.println("\n"+"Invalid choice!"+"\n");
			break;
		}
		
	}
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("1. View balance");
		System.out.println("2. Withdraw funds");
		System.out.println("3. Deposite funds");
		System.out.println("4. Exit");
		System.out.print("= ");
		int selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Balance: "+c1.getSavingBalance()+"BDT");
			getAccountType();
			break;
		case 2:
			c1.getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			c1.getSavingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using ATM");
			break;
		default:
			System.out.println("\n"+"Invalid choice!"+"\n");
			break;
		}
		
	}

}
