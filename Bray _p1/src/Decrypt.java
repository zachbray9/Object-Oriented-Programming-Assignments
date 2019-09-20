import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int temp;
		int i;
		int [] numbers = new int[4];
		String digits;
		
		//asks the user for 4 digit number and enters it as a string
		System.out.print("Enter a four digit integer (No spaces):");
		digits = scnr.next();
		
		//converts the numbers in the string from characters to integers
		for(i=0; i<4; i++) {
			numbers[i] = digits.charAt(i) - '0';
		}
		
		//swaps the first and third digits
		temp = numbers[0];
		numbers[0] = numbers[2];
		numbers[2] = temp;
				
		//swaps the second and fourth digits
		temp = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = temp;
		
		//decrypts current digit back to original digit
		for(i=0; i<4; i++) {
			if(numbers[i] > 0 && numbers[i] < 7) {
				numbers[i] = numbers[i] +3;
			}
			else if(numbers[i] > 6 && numbers[i] < 10) {
				numbers[i] -= 7;
			}
			else {
				numbers[i] = 3;
			}
		}
		
		//prints out the new decrypted number
		System.out.print("Your decrypted number is ");
		for(i=0; i<4; i++) {
			System.out.printf("%d", numbers[i]);
		}

	}

}
