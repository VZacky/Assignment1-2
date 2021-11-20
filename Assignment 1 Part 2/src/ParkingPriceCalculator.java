import java.util.Scanner;

/**
 * Class ParkingPriceCalculator
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 7, 2021
 */

public class ParkingPriceCalculator {

	public static void main(String[] args) {
		
		Scanner myInfo = new Scanner(System.in);
		System.out.print("Please imput the number of minutes your car has parked: ");
		double timeParkedMin = myInfo.nextDouble();
		
		myInfo.close();
		
		double timeParkedHour = (timeParkedMin/60);
		int timeParkedLow = (int) (timeParkedMin/60);
		
		if (timeParkedHour > timeParkedLow) {
			timeParkedHour = timeParkedLow + 1;
		}
		
		double price = 2*timeParkedHour;
		
		System.out.printf("%-25s:%s%.0f\n%-25s:%s%.0f\n%-25s:%s%.2f\n",
				"Parking time (minutes)", " ", timeParkedMin,
				"Parking time (hour)", " ", timeParkedHour,
				"Price", " ", price);

	}

}