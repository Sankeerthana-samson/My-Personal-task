//Calculate the factorial of a 9
package Assignments;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

