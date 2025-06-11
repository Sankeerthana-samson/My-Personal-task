//Print the multiplication table of a 29 using while loop.
package Assignments;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 29; 
        int i = 1;

        // Using while loop to generate the multiplication table
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
