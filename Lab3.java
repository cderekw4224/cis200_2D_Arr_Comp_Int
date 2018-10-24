/** Lab 3 - Week 3
 * Lab3.java
 * Author: Derek Christensen
 * Date: 20181018
 * Calculate the ROI for various parameters
 * (used for your later reference)
*/

/** Lab3.java

	- Using a loop, read in info for up to 10 (declare as a constant) separate clients. 
	Loop until the user no longer wants to enter clients (or max is reached). 
	For each client, use parallel arrays to store the following (entered by the user): 
		- client’s Last Name, 
		- Social Security Number (entered in the form ###-##-####), 
		- amount to be invested (assume int $100-$10,000), 
		the interest rate (assume int 5-10
	percent) and the term (years) of the investment (assume int 1-10). 
	You can store these last 3 values in either 3 separate int arrays or a single 2D array.
  
 */

import java.util.*;
//import java.lang.*;

public class Lab3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		
	 		variables and constants
	 	
	 	*/
		
		Scanner s = new Scanner(System.in);
		
		final int NUM_CUSTOMERS = 10;
		final int NUM_PARAMETERS = 3;
		
		String [] lastNameArr = new String[NUM_CUSTOMERS];
		String [] ssnArr = new String[NUM_CUSTOMERS];
		int [][] investRateYearsArr = new int [NUM_CUSTOMERS][NUM_PARAMETERS];
		char anotherInvestor = 'Y';

		double [] [] tableArr = {  {1.05, 1.06, 1.07, 1.08, 1.09, 1.10},		//row 1
			{1.1025, 1.1236, 1.1449, 1.1664, 1.1881, 1.21},						//row 2
			{1.1576250, 1.1910160, 1.2250430, 1.2597120, 1.2950290, 1.331},		//row 3
			{1.2155063, 1.2624770, 1.3107960, 1.3604890, 1.4115816, 1.4641},	//row 4
			{1.2762816, 1.3382256, 1.4025517, 1.4693281, 1.5386240, 1.61051}, 	//row 5
			{1.3400956, 1.4185191, 1.5007304, 1.5868743, 1.6771001, 1.771561}, 	//row 6
			{1.4071004, 1.5036303, 1.6057815, 1.7138243, 1.8280391, 1.9487171}, //row 7
			{1.4774554, 1.5938481, 1.7181862, 1.8509302, 1.9925626, 2.1435888}, //row 8
			{1.5513282, 1.6894790, 1.8384592, 1.9990046, 2.1718933, 2.3579477}, //row 9
			{1.6288946, 1.7908477, 1.9671514, 2.1589250, 2.3673637, 2.5937425} 	//row 10
		}; // end declaration and initialization of 2D array
		
		
		/**
		
		 	do-while enter investor info
		
		*/
		
		int investor = 0;
		System.out.println("Enter all values as integers.");
		
		do
		{
			// last name of investor
			System.out.print("Last Name: ");
			lastNameArr[investor] = s.nextLine();
			
			// ssn of investor
			System.out.print("SSN (###-##-####): ");
			ssnArr[investor] = s.nextLine();
			
			// investment parameters: amount, rate, time
			for (int irt = 0; irt < NUM_PARAMETERS; irt++) {
				
				// enter investment amount between 100-10,000, inclusive
				if (irt == 0) {
					//  do-while assign investment amount & request to re-enter if invalid amount
					do
					{
						System.out.print("Amount to be invested ($100-$10,000): ");
						investRateYearsArr[investor][irt] = Integer.parseInt(s.nextLine());
						
						if (investRateYearsArr[investor][irt] < 100 || investRateYearsArr[investor][irt] > 10000) {
							System.out.println("Please enter a value between $100-$10,000, inclusive.");
						}  // end if
					} while (investRateYearsArr[investor][irt] < 100 || investRateYearsArr[investor][irt] > 10000);
					  //  end do-while assign investment amount & request to re-enter if invalid amount
				}  // end if investment amount between 100-10,000, inclusive
				
				// enter interest rate between 5-10, inclusive
				else if (irt == 1) {
					//  do-while assign interest rate amount & request to re-enter if invalid amount
					do
					{
						System.out.print("Interest Rate (5-10): ");
						investRateYearsArr[investor][irt] = Integer.parseInt(s.nextLine());
						
						if (investRateYearsArr[investor][irt] < 5 || investRateYearsArr[investor][irt] > 10) {
							System.out.println("Please enter a value between 5-10, inclusive.");
						}  // end if
					} while (investRateYearsArr[investor][irt] < 5 || investRateYearsArr[investor][irt] > 10);
						// end do-while assign interest rate amount & request to re-enter if invalid amount
				}  // end else if interest rate between 5-10, inclusive
				
				// enter term in years between 1-10, inclusive
				else if (irt == 2) {
					//  do-while assign term length & request to re-enter if invalid length
					do
					{
						System.out.print("Term (Years) (1-10): ");
						investRateYearsArr[investor][irt] = Integer.parseInt(s.nextLine());
						
						if (investRateYearsArr[investor][irt] < 1 || investRateYearsArr[investor][irt] > 10) {
							System.out.println("Please enter a value between 1-10, inclusive.");
						}  //  end if
					} while (investRateYearsArr[investor][irt] < 1 || investRateYearsArr[investor][irt] > 10);
						//  end do-while assign term length & request to re-enter if invalid length
					
				}  // end else if term in years between 1-10, inclusive
				
			}  //  end for investment parameters: amount, rate, time
			
			// prompt to enter another investor
			System.out.print("Enter another investor (Y)es or (N)o: ");
			String response = (s.nextLine()).toUpperCase();
			anotherInvestor = response.charAt(0);
			
			investor++;
			
		} while (investor < NUM_CUSTOMERS && anotherInvestor != 'N');  //  end do-while enter investor info
		System.out.println();
		
		
		/**
		
		 	creation of name/ssn unique identifier
		 	
		 */
		
		String [] modNameArr = new String[investor];
		
		for (int i = 0; i < investor; i++) {
			
			StringBuilder testSB = new StringBuilder();
			testSB.append(lastNameArr[i].substring(0, 4));
			testSB.append(ssnArr[i].substring(7, 11));
			modNameArr[i] = testSB.toString();
		}  // end for creation of name/ssn unique identifier
		
		
//		/**
//	 		
//	 		output of investor investment, rate & term tuples (optional)
//	 		
//		 */
//		
//		for (int row = 0; row < investor; row++) {
//			
//			System.out.print("[");
//			
//			for (int col = 0; col < 3; col++) {
//				if (col < 2) {
//					System.out.print(investRateYearsArr[row][col] + ", ");
//				}  //  end if
//				else {
//					System.out.print(investRateYearsArr[row][col]);
//				}  //  end else
//			} //  end for
//			
//			System.out.println("]");
//			System.out.println();
//			
//		}  //  end for investor investment, rate & term tuples
		
		
		/**
			calculation of interest
		 */
		
		double [] compoundValArr = new double[investor];
		double [] interestArr = new double[investor];
		
		for (int i = 0; i < investor; i++) {
			compoundValArr[i] = investRateYearsArr[i][0] *
								tableArr[investRateYearsArr[i][2]-1]
								        [investRateYearsArr[i][1]-5];
			interestArr[i] = compoundValArr[i] - investRateYearsArr[i][0];
		}  //  end for calculation of interest
		
		
		/**
			output
		 */
	
		for (int i = 0; i < investor; i++) {
			System.out.printf("%s\tCompound Value: $%-,10.2f\tInterest: $%-,10.2f\n", 
					modNameArr[i], compoundValArr[i], interestArr[i]);
		}  //  end for output
		
		s.close();
	}  // end main
}  // end class
