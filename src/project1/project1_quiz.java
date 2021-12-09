package project1;

import java.util.Scanner;

public class project1_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Wright State School of Math!");
		int choice = 0;
		int correct = 0;
		int tries = 0;
		double percent = 0.00;
		while (choice !=6) {
		System.out.println(" ");
		System.out.println("Please choose one of the following options for your math quiz: ");
		System.out.println("1. Addition with numbers 1­-10");
		System.out.println("2. Addition with numbers 1­-100");
		System.out.println("3. Subtraction with numbers 1­-10");
		System.out.println("4. Subtraction with numbers 1­-100");
		System.out.println("5. Multiplication with numbers 1­-10");
		System.out.println("6. End the program");
		choice = in.nextInt();
		System.out.println(" ");
		if (choice < 1 || choice > 6) {
			System.out.print("Valid choices are 1-­6; please re­-enter ");
			choice = in.nextInt();
		}
		
		
		int i;
		
		for (i=0; i<=4; i++) {
		if (choice == 1 || choice == 3 || choice == 5) {
			int random1 = (int)(1 + Math.random() * (10));
			int random2 = (int)(1 + Math.random() * (10));
			if (choice == 1) {
				System.out.println(" ");
				System.out.println("Enter the answer to the following problem: " + random1 + " + " + random2);
				int guess = in.nextInt();
				tries = tries + 1;
				int answer = random1 + random2;
				if (guess==answer)	{
					System.out.println("That is the correct answer! ");
					correct = correct + 1;
				}else {
					System.out.println("Sorry, that is incorrect. The correct answer is " + answer);
					}
				}
			if (choice == 3) {
				System.out.println(" ");
				System.out.println("Enter the answer to the following problem: " + random1 + " - " + random2);
				int guess = in.nextInt();
				tries = tries + 1;
				int answer = random1 - random2;
				if (guess==answer)	{
					System.out.println("That is the correct answer! ");
					correct = correct + 1;
				}else {
					System.out.println("Sorry, that is incorrect. The correct answer is " + answer);
					}		
			}
			if (choice == 5) {
				System.out.println(" ");
				System.out.println("Enter the answer to the following problem: " + random1 + " * " + random2);
				int guess = in.nextInt();
				tries = tries + 1;
				int answer = random1 * random2;
				if (guess==answer)	{
					System.out.println("That is the correct answer! ");
					correct = correct + 1;
				}else {
					System.out.println("Sorry, that is incorrect. The correct answer is " + answer);
					}
					
			}
			}
		
		if (choice == 2 || choice ==4) {
			int random11 = (int)(1 + Math.random() * (100));
			int random22 = (int)(1 + Math.random() * (100));
			if (choice == 2) {
				System.out.println(" ");
				System.out.println("Enter the answer to the following problem: " + random11 + " + " + random22);
				int guess = in.nextInt();
				tries = tries + 1;
				int answer = random11 + random22;
				if (guess==answer)	{
					System.out.println("That is the correct answer! ");
					correct = correct + 1;
				}else {
					System.out.println("Sorry, that is incorrect. The correct answer is " + answer);
					}
			}
			if (choice == 4) {
				System.out.println(" ");
				System.out.println("Enter the answer to the following problem: " + random11 + " - " + random22);
				int guess = in.nextInt();
				tries = tries + 1; 
				int answer = random11 - random22;
				if (guess==answer)	{
					System.out.println("That is the correct answer! ");
					correct = correct + 1;
				}else {
					System.out.println("Sorry, that is incorrect. The correct answer is " + answer);
					}
			}
		}
		
		}
		if (choice == 6) {
			System.out.println(" ");
			percent = (correct*100)/tries;
			System.out.println("You got " + correct + " problems correct out of " + tries + " problems attempted. That is " + percent + " percent correct. Goodbye!");
	}
}
in.close();
	}
	
}
