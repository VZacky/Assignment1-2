import java.util.Scanner;

/**
 * Class BirthYearCalculator
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 7, 2021
 */

public class BirthYearCalculator {

	public static void main(String[] args) {
		
		Scanner myInfo = new Scanner(System.in);
		System.out.print("Please input a birth year: ");
		String birthYear = myInfo.nextLine();
		
		myInfo.close();
			
		String century = birthYear.substring(0,2);
		int c = Integer.parseInt(century);
		int cFinal = c + 1;
		
		String decade = birthYear.substring(2,3);
		int d = Integer.parseInt(decade);
		int dFinal = d * 10;
		
		System.out.printf("%-15s:%s%s\n%-15s:%s%d\n%-15s:%s%d",
				"Birth Year", " ", birthYear,
				"Century", " ", cFinal,
				"Decade", " ", dFinal);

	}

}