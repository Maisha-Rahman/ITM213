package atm_machine;

import java.util.ArrayList;
import java.util.Scanner;

public class main_atm extends operation{

	private static Scanner in;

	public static void main(String[] args) {
		
		ArrayList<Integer> atmnumber = new ArrayList<Integer>();
	    atmnumber.add(12345);
	    atmnumber.add(67890);
	    atmnumber.add(58964);
	    
	    ArrayList<Integer> atmpin = new ArrayList<Integer>();
	    atmpin.add(4321);
	    atmpin.add(1489);
	    atmpin.add(7523);
		
		in = new Scanner(System.in);
		
		operation c= new operation();
		
		System.out.println("Welcome to ATM machine!");
		System.out.print("Enter ATM number: ");
		int atmNumber=in.nextInt();
		System.out.print("Enter pin: ");
		int atmPin=in.nextInt();
		
		if(atmnumber.contains(atmNumber) && atmpin.contains(atmPin)) {
			
			c.getAccountType();
			c.getChecking();
			c.getSaving();
		}
		else {
			System.out.println("Incorrect ATM number or PIN!");
			System.exit(0);;
		}
	}

}
