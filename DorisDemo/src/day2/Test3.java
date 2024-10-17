package day2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
//		type[] aryName = new type[length];
//		type[] aryName = {value1,value2,value3,value4};
		
		int[] arr = new int[5];	//index:0~length-1
//		//use aryName[index] to access the element of array
		
//		arr[0] = 11;
//		arr[1] = 22;
//		arr[2] = 66;
//		arr[3] = 99;
//		arr[4] = 33;
		
		Scanner scanner = new Scanner(System.in);
		//user input 5 values, save them one by one into array
//		System.out.println("enter a number:");
//		arr[0] = scanner.nextInt();
//		System.out.println("enter a number:");
//		arr[1] = scanner.nextInt();
//		System.out.println("enter a number:");
//		arr[2] = scanner.nextInt();
//		System.out.println("enter a number:");
//		arr[3] = scanner.nextInt();
//		System.out.println("enter a number:");
//		arr[4] = scanner.nextInt();
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("enter a number:");
			arr[i] = scanner.nextInt();
		}
		
//		int[] arr = {11,22,66,99,33};
		
//		arr[5] = 100;		//wrong, array index out of bounds

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i=0 ; i<arr.length ; i++) {	//i:index
			System.out.println(arr[i]);
		}
		/*
		for(int i=0 ; i<aryName.length ; i++) {
			use aryName[i] to access the element of array one by one
		}
		*/
	}

}






