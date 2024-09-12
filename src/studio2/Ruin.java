package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the start amount? ");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance? ");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit? ");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt();
		
		for(int count = 0; count < totalSimulations;) {
			while (startAmount > 0 && startAmount < winLimit && count < totalSimulations) {
				
				if (Math.random() <= winChance) {
					startAmount++;
					count++;
					System.out.println("Day " + count + " : " + startAmount + " Win!");
				} else {
					startAmount--;
					count++;
					System.out.println("Day " + count + " : " + startAmount + " Lose :(");
				}
				
			}
			
			
		}
		
		if(startAmount== 0) {
			System.out.println("Ruin");
		}
		if(startAmount == winLimit) {
			System.out.println("Success!");
		}
		
			
	}
}
