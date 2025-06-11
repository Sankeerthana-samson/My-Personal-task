//Print the below Patterns
package Assignments;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int rows=6; //Star patters
for(int i=1;i<=rows;i++) //Outerloop
{
	for(int j=1;j<=i;j++) {  //innerloop
		System.out.print("*");
}
System.out.println();
	}
	}

}*/

   /*     int rows = 6; //Number pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/

	/*	int rows =6; //Reverse number pattern
		for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
			}
		}
}
*/
		int n =8; //alphabet pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print((char)('A' +j) + " ");
            }
            System.out.println();
        }
    }
}
		