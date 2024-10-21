package day2;

import java.util.Scanner;

public class App {
	//写一个void guessingGame（int numberToGuess）方法，它传递一个1到100之间的数字，然后进行猜测。
	//在该方法中，从键盘循环读取数字，并指示numberToGuess是否大于或小于输入的数字。尝试10次或猜出数字后退出循环。
	
	//Schreiben Sie eine Methode void guessingGame(int numberToGuess), 
	//der eine Zahl zwischen 1 und 100übergeben wird, die es anschließend zu erraten gilt.  
	//In der Methode lesen Sie Zahlen in einer Schleifevon der Tastatur ein und geben einen Hinweis aus,
	//ob numberToGuess größer oder kleiner als die eingegebene Zahl ist.  
	//Beenden Sie die Schleife entweder nach 10 Versuchen oder bei Erraten der Zahl.
	public void guessingGame(int numberToGuess) {
		Scanner scanner = new Scanner(System.in);
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("guess number "+i+":");
			int guess = scanner.nextInt();
			if(guess>numberToGuess) {
				System.out.println("The number AI picked is lower than your guess.");
			}else if(guess<numberToGuess){
				System.out.println("The number AI picked is greater than your guess.");
			}else {
				System.out.println("you won wisenheimer");
//				break;	//interrupt the loop
				return; //stop the program
			}
		}
		System.out.println("you lost");
	}
	
	//generate 10 random long number,and return them
	//1 parameter: the initial value
	public long[] lcg(long init){
		long[] arr = new long[10];
		arr[0] = init;
		//loop to access every element of the array
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i]
//		}
		long a = (long)Math.pow(2, 31);
		long c = 1103515245;
		long m = 12345;
		
		for(int i=1 ; i<arr.length ; i++) {
			arr[i] = (a*arr[i-1]+c)%m;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		App app = new App();
		app.guessingGame(54);
//		app.guessingGame(80);
	}

}






