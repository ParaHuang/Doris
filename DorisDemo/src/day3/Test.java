package day3;

public class Test {

	public static void main(String[] args) {
		//the entrance of the program
		//use Book
		//class -> object:instantiation
		//Type objectName = new Type();
		//objectName/instanceName/refrenceName
		Book b1 = new Book();
		//.   of        . 's
//		b1.name = "Harry Potter";
//		b1.price = -15;
//		b1.type = "magic";
//		b1.author = "JK";
		
		b1.setName("Harry Potter");	
		b1.setPrice(-15);
		b1.setType("magic");
		b1.setAuthor("JK");
		
		b1.read();
		b1.translate();
		String bookName = b1.getName();
		System.out.println("the name of 1st book:"+bookName);
		System.out.println("the price of 1st book:"+b1.getPrice());
		System.out.println("the type of 1st book:"+b1.getType());
		System.out.println("the author of 1st book:"+b1.getAuthor());
		
		System.out.println();
		
		Book b2 = new Book();
		b2.setName("Little Prince");	
		b2.setPrice(0.01);
		
		b2.read();
		b2.translate();
		
		System.out.println("the name of 2nd book:"+b2.getName());
		
//		int x ;
//		x = 10;//assign a value
//		System.out.println(x);//obtain the value
		
	}

}















