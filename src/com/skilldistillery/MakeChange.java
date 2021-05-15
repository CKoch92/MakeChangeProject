package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {
	
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("What is the price of your item? ");
		double price = kb.nextDouble();

		System.out.print("How much money was tendered? ");
		double payment = kb.nextDouble();
		
		
		
		
		double change = payment - price;
		int num20 = (int) (change / 20);
		double change10 = (double) change - (double) num20 * 20;
		int num10 = (int) (change10 / 10);
		double change5 = (double) change10 - (double) num10 * 10;
		int num5 = (int) (change5 / 5);
		double change1 = (double) change5 - (double) num5 * 5;
		int num1 = (int) (change1 / 1);
		double changeQuarter = (double) change1 - (double) num1 * 1;
		int numQuarter = (int) (changeQuarter / 0.25);
		double changeDime = (double) changeQuarter - (double) numQuarter * 0.25;
		int numDime = (int) (changeDime / 0.10);
		double changeNickel = (double) changeDime - (double) numDime * 0.10;
		int numNickel = (int) (changeNickel / 0.05);
		double changePenny = (double) changeNickel - (double) numNickel * 0.05;
		int numPenny = (int) (changePenny / 0.01);
		

		
		
		
		
		if (payment == price) {
			System.out.println("You paid the exact amount and will not receive any change.");
		}
		else if (payment < price) {
			System.out.println("Please provide additional funds to complete the purchase.");
		}
		else {
			System.out.println("Thank you for your payment. Your change is $" + change);
			if (num20 >= 1) {
				System.out.println("$20 bills: " + num20);	
			}
			if (num10 >= 1) {
				System.out.println("$10 bills: " + num10);	
			}
			if (num5 >= 1) {
				System.out.println("$5 bills: " + num5);	
			}
			if (num1 >= 1) {
				System.out.println("$1 bills: " + num1);
			}
			if (numQuarter >= 1) {
				System.out.println("Quarters: " + numQuarter);
			}
			if (numDime >= 1) {
			System.out.println("Dimes: " + numDime);
			}
			if (numNickel >= 1) {
				System.out.println("Nickels: " + numNickel);
			}
			if (numPenny >= 1) {
				System.out.println("Pennies: " + numPenny);
			}
		
			
			
			
			
			
		}
		
		kb.close();
		
	

}
}

