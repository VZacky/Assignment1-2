import java.util.Scanner;

/**
 * Class WebAddressExtractor
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 7, 2021
 */

public class WebAddressExtractor {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Please input a web address: ");
		String url = myObj.nextLine();
		
		myObj.close();
		
		String lowerUrl = url.toLowerCase();
		
        String[] urlSplit = lowerUrl.split("\\.");
        
	    System.out.printf("%-15s:%s%s\n%-15s:%s%s\n%-15s:%s%s\n%-15s:%s%s",
	    		"Address", " ", lowerUrl,
	    		"Heading", " ", urlSplit[0],
	    		"Company", " ", urlSplit[1],
	    		"Extension", " ", urlSplit[2] );
        
	}

}