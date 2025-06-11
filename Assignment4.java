//Check the grading System
//if number is between 20 and 40  and number in maths is <20 print D
//if number is between 40 and 60  and number in maths is >30 print C
//if number is between 60 and 80  and number in maths is >60 print B
//if number is between 80 and 100  and number in maths is >80 print A

package Assignments;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=35;
if(marks>=80)
{
	System.out.println("Marks grade is A");
}
else if(marks>=60)
{
	System.out.println("Marks grade is B");
}
else if(marks>=30)
{
	System.out.println("Marks grade is C");
}
else
{
	System.out.println("Fail");
}
	}

}
