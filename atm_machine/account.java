package atm_machine;

import java.util.Scanner;

public class account {
	Scanner input= new Scanner(System.in);
	
	private double checkingBalance;
	private double savingBalance;
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	public double caclCheckingDeposite(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	public double caclSavingDeposite(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() {
		System.out.println("Balance: "+ checkingBalance+"BDT");
		System.out.print("Enter the amount you want to withdraw: ");
		double amount=input.nextDouble();
		
		if(checkingBalance-amount>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Balance: "+ checkingBalance+"BDT");
		}
		else {
			System.out.println("Not sufficient fund!");
		}
	}
	public void getSavingWithdrawInput() {
		System.out.println("Balance: "+ savingBalance+"BDT");
		System.out.print("Enter the amount you want to withdraw: ");
		double amount=input.nextDouble();
		
		if(savingBalance-amount>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Balance: "+ savingBalance+"BDT");
		}
		else {
			System.out.println("Not sufficient fund!");
		}
	}
	public void getCheckingDepositeInput() {
		System.out.println("Balance: "+ checkingBalance+"BDT");
		System.out.print("Enter the amount you want to deposite: ");
		double amount=input.nextDouble();
		if(checkingBalance+amount>=0) {
			caclCheckingDeposite(amount);
			System.out.println("New Balance: "+ checkingBalance+"BDT");
		}
		else {
			System.out.println("Amount cannot be Negative");
		}
	}
	public void getSavingDepositeInput() {
		System.out.println("Balance: "+ savingBalance+"BDT");
		System.out.print("Enter the amount you want to deposite: ");
		double amount=input.nextDouble();
		if(savingBalance+amount>=0) {
			caclSavingDeposite(amount);
			System.out.println("New Balance: "+ savingBalance+"BDT");
		}
		else {
			System.out.println("Amount cannot be Negative");
		}
	}	
	

}
