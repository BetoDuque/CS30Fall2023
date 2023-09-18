package SkillBuilder;

import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Please enter your first grade: ");
		double avg1 = Scan.nextInt();
		
		System.out.print("Please enter your second grade: ");
		double avg2 = Scan.nextInt();
		
		System.out.print("Please enter your third grade: ");
		double avg3 = Scan.nextInt();
		
		System.out.println("Your average is: " + (avg1+avg2+avg3)/3);
	}

}
