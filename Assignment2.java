//2> Find largest between 4 numbers 

package Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10, b=20, c=30, d=12;
		
		int a=10;
				int	b=70;
						int	c=50;
								int	d=72;
		
		int max= Math.max(Math.max(a, b), Math.max(c,d));
		System.out.println("This is the largest number "+max);

	}

}
