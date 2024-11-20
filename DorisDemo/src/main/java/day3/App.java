package day3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10, 10, 100, 100);
		Rectangle r2 = new Rectangle(80,80);
		Rectangle r3 = new Rectangle(r1);

		System.out.println(r1.getCount());
		System.out.println(r2.getCount());
		System.out.println(r3.getCount());
//		System.out.println(Rectangle.count);
//		System.out.println(Rectangle.getCount());

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		System.out.println();
	}

}
