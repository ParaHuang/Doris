package day2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loop,array,methods
		//want open pet shop:
		//cats(5) + dogs
		//open it
		Scanner scanner = new Scanner(System.in);
		int catCount = 0;
		// for(;;)     ==    while(true)
		while(true){
			System.out.println("what should we buy for the shop? 1-cat, other number-dog:");
			int option = scanner.nextInt();
			if(option==1) {
				catCount++;
			}
			//when to stop
//			when there are 5 cats, then we stop
			if(catCount == 5) {
				break;
			}
		}
	}

}
