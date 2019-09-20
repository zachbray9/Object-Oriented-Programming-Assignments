import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int temp;
		int i;
		int [] numbers = new int[4];
		String digits;
		
		//asks user for 4 digit integer and enters it as a string
		System.out.print("Enter a four digit integer (No spaces):");
		digits = scnr.next();
		
		//converts the numbers in the string from characters to integers
		for(i=0; i<4; i++) {
			numbers[i] = digits.charAt(i) - '0';                        
		}
		
		//adds 7 and finds the remainder after dividing by 10 for each digit
		for(i=0; i<4; i++) {
			numbers[i] = (numbers[i] + 7) % 10;
		}
		
		//swaps the first and third digits
		temp = numbers[0];
		numbers[0] = numbers[2];
		numbers[2] = temp;
		
		//swaps the second and fourth digits
		temp = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = temp;
		
		//prints the new encrypted number
		System.out.print("\nYour encrypted number is ");
		for(i=0; i<4; i++) {
			System.out.printf("%d", numbers[i]);
		}
		
		
	}

}
