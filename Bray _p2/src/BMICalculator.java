import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double weightInPounds;
		double heightInInches;
		double weightInKilograms;
		double heightInMeters;
		double BMI = 0;
		char choice;
		
		System.out.println("Would you like your BMI to be measured using pounds/inches or kilograms/meters?");
		System.out.println("Enter 'c'  for pounds/inches or enter 'm' for kilograms/meters: ");
		
		choice = scnr.next().charAt(0);
		
		switch(choice) {
		   case 'c':
			   System.out.println("Enter your weight in pounds: ");
			   weightInPounds = scnr.nextDouble();
			   System.out.println("Enter your height in inches: ");
			   heightInInches = scnr.nextDouble();
			   
			   BMI = (703 * weightInPounds) / Math.pow(heightInInches, 2);
			   break;
		   case 'm':
			   System.out.println("Enter your weight in kilograms: ");
			   weightInKilograms = scnr.nextDouble();
			   System.out.println("Enter your height in meters: ");
			   heightInMeters = scnr.nextDouble();
			   
			   BMI = weightInKilograms / Math.pow(heightInMeters, 2);
			   break;
		   default:
			   System.out.println("Sorry, that is not a valid option.");
			   break;
		}
		
		if(choice != 'c' && choice != 'm') {
			;
		}
		else {
		System.out.printf("\nYour body mass index is %.1f\n\n", BMI);
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		}
		

	}

}
