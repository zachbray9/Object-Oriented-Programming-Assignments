import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[5];
		topics[0] = "World Hunger";
		topics[1] = "Global Warming";
		topics[2] = "Terrorism";
		topics[3] = "The Warriors blew a 3-1 lead";
		topics[4] = "The ending of Game of Thrones was ruined";
		
		int [][] responses = new int[5][10];
		char choice = 'y';
		int tempAnswer;
		int i, j;
		double sumOfRatings = 0;
		int numVoters = 0;
		double highestPointTotal = 0, lowestPointTotal = 0;
		String highestTopic = "";
		String lowestTopic = "";
		
		//initialize all elements in responses to 0
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 10; j++) {
				responses[i][j] = 0;
			}
		}
		
		//give the user the option to rate the topics again or quit
		while(choice == 'y') {
			System.out.println("---Rate the following topics on a scale of 1(least important) to 10(most important)---");
			
			for(i = 0; i < 5; i++) {
			   System.out.printf("%s: ", topics[i]);
			   tempAnswer = scnr.nextInt();
			   responses[i][tempAnswer - 1] += 1;
			}
			
			numVoters += 1;
			System.out.printf("\nWould you like to rate theses topics again? (y/n)\n");
			choice = scnr.next().charAt(0);
		}
		
		//print the results of the poll
		System.out.printf("%44d  2  3  4  5  6  7  8  9  10\n\n", 1);
		
		lowestPointTotal = 1.8 * Math.pow(10, 308);
		
		for(i = 0; i < 5; i++) {
			System.out.printf("%-42s ", topics[i]);
			sumOfRatings = 0;
			for(j=0; j<10; j++) {
				System.out.printf("%d  ", responses[i][j]);
				sumOfRatings += ((j + 1) * responses[i][j]);
			}
			if(sumOfRatings > highestPointTotal) {
				highestPointTotal = sumOfRatings;
				highestTopic = topics[i];
			}
			if(sumOfRatings < lowestPointTotal) {
				lowestPointTotal = sumOfRatings;
				lowestTopic = topics[i];
			}
			System.out.printf("\t\tThe average rating is %.2f\n", (double)(sumOfRatings) / numVoters);
		}
		
		//print the highest and lowest point totals
		System.out.printf("\n\n\"%s\" had the highest point total with a total of %d points.\n", highestTopic, (int)(highestPointTotal));
		System.out.printf("\"%s\" had the lowest point total with a total of %d points.\n", lowestTopic, (int)(lowestPointTotal));

	}

}
