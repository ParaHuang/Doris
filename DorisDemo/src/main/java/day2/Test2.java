package day2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 * 
		 ** 
		 ***
		 ****
		 *****
		 
		 1				i:1		j:1
		 12				i:2		j:12
		 123			i:3		j:123
		 1234			i:4
		 12345			i:5		j:12345	
		 ------------------------------------------
		 1234			i:1		j:					4numbers
		 123			i:2		j:					3numbers
		 12				i:3		j:					2numbers
		 1				i:4		j:					1numbers
		 				i							5-i numbers
		  
		      *
		     ***
		    *****
		   *******
		  *********
		  
		  1
		 123
		12345
	   1234567	
		  
		 */
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
		for(int i=1 ; i<=10 ; i++) {	//rows
//			System.out.println("*****");   ==
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
			
			for(int j=1 ; j<=50 ; j++) {//columns
				System.out.print("*");
			}
			
			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1 ; i<=15 ; i++) {	//rows
			//1	-		1*
			//2	-		2*
			//3	-		3*
			//i -		i*
			//
			for(int j=1 ; j<=i ; j++) {//columns
				System.out.print("*");
			}
			
			
			System.out.println();
		}


		System.out.println();
		System.out.println();
		System.out.println();
		
		int rows = 13;
		for(int i=1 ; i<=rows/2+1 ; i++) {	//rows
			for(int j=1 ; j<=i ; j++) {//columns
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1 ; i<=rows/2 ; i++) {
			for(int j=1 ; j<=rows/2+1-i ; j++) {//how many numbers j can be, means how many times this loop will go
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}






