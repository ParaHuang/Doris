package day1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// type variableName = value;
		// 8 primitive types:  short int long     float double    char  boolean   byte
		// Type variableName = new Type();
		// reference type :   String   Scanner
		
		int a = 10;
		int b = 2;
		
		//operators:
		//math operator:  + - *  /   %
		//relationship operator:  >   >=   <   <=   ==     !=			the result is true/false
		//logical operator:  !   &&  ||
		//assignment operator:   =  +=   -=  *=  /=   %=
		
		
		//decision
		/*
		 if(statement){
		 	operation
		 }
		 
		 if(statement){
		 	operationA
		 }else{
		 	operationB
		 }
		 
		 
		 if(statement1){
		 	operationA
		 }else if(statement1){
		 	operationB
		 }else if(statement3){
		 	operationC
		 }else{
		 	operationD
		 }
		 */
		
		//the user enter an integer number, see if it's even or odd
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		if(num%2 == 0) {
//			System.out.println(num+" is even");
//		}else {
//			System.out.println(num+" is odd");
//		}
		
		//100   >=60
		//>=80   A
		//>=70	 B
		//>=60   C
		//		 D
		
//		switch...case...
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int poker = scanner.nextInt();  
		//1:	you have an Ace of heart
		//2:	you have a 2 of heart
		//3:	you have a 3 of heart
		//4:	you have a 4 of heart
		//......
		//10:	you have a 10 of heart
		//11:	you have a J of heart
		//12:	you have a Q of heart
		//13:	you have a K of heart
		//14:	you have a Joker
		//15:	you have a Joker
		//others: invalid poker
		if(poker==1) {
			System.out.println("you have an Ace of heart");
		}else if(poker>=2 && poker<=10) {
			System.out.println("you have an "+poker+" of heart");
		}else if(poker==11) {
			System.out.println("you have an J of heart");
		}else if(poker==12) {
			System.out.println("you have an Q of heart");
		}else if(poker==13) {
			System.out.println("you have an K of heart");
		}else if(poker==14 || poker==15) {
			System.out.println("you have a Joker");
		}else {
			System.out.println("invalid poker");
		}
		
		switch (poker) {	//the result of statement could be number, char,String
		case 1:	//case to talk about the result possibility
			System.out.println("you have an Ace of heart");
			break;
		case 2,3,4,5,6,7,8,9,10:
			System.out.println("you have an "+poker+" of heart");
			break;
		case 11:
			System.out.println("you have a Jack of heart");
			break;
		case 12:
			System.out.println("you have a Queen of heart");
			break;
		case 13:
			System.out.println("you have a King of heart");
			break;
		case 14,15:
			System.out.println("you have a Joker");
			break;
		default:
			System.out.println("invalid poker");
			break;
		}
		
		
	}

}































