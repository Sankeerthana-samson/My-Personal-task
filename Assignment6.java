//Count the number of digits in an integer.
package Assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number = 6689;
	        int count = 0;

	        // Loop to count digits
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        System.out.println("Number of digits: " + count);
	    }
	}

