import java.util.Scanner;

/**
 * Class SimpleStatisticCalculator
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 7, 2021
 */

public class SimpleStatisticCalculator {

	public static void main(String[] args) {
		
		Scanner myNum = new Scanner(System.in);
		System.out.print("Please input 5 numbers seperated by spaces: ");
		
		double a = myNum.nextDouble();
		double b = myNum.nextDouble(); 
		double c = myNum.nextDouble(); 
		double d = myNum.nextDouble(); 
		double e = myNum.nextDouble();
		
		myNum.close();
		
		double allNum[] = {a, b, c, d, e};
		double sum = 0;
		for (int i = 0 ; i < allNum.length ; i++) {
			sum += allNum[i];
		}
		double mean = sum/allNum.length;
		
		double max = Math.max(Math.max(Math.max(Math.max(a, b),c), d), e);
		
		double min = Math.min(Math.min(Math.min(Math.min(a, b),c), d), e);
		
	    double xSum = 0;
		double x = 0;
		for (int i = 0 ; i < allNum.length ; i++) {
			x = allNum[i];
			xSum += Math.pow(x-mean, 2);
		}
		
		double sd = Math.sqrt((Math.abs(xSum))/allNum.length);
		
		System.out.printf("%-20s:%s%.2f%s%.2f%s%.2f%s%.2f%s%.2f\n%-20s:%s%.2f\n%-20s:%s%.2f\n%-20s:%s%.2f\n%-20s:%s%.2f",
				"Numbers", " ", a, ", ", b, ", ", c, ", ", d, ", ", e,
				"Mean", " ", mean,
				"Minimum", " ", min,
				"Maximum", " ", max,
				"Standard Deviation", " ", sd);

	}

}