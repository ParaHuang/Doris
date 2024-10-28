package day3;

public class Rectangle {
	//1. 4 fields
	private int x1;
	private int y1; //x1,y1 -> leftBottom point
	private int x2;
	private int y2;	//x2,y2 -> rightTop point
	private static int count;		//leave it here like this, change later
	
	//2a
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		count++;
	}
	//2b: width, height, default think x1=0, y1=0, x2=?,y2=?
	public Rectangle(int width,int height) {
//		x1 = 0;
//		y1 = 0;
//		x2 = width;
//		y2 = height;
		//use of this
//		this(value1,value2,value3,value);	//using the other constructor. which one? depends on the format of values
		this(0,0,width,height);
	}
	
	//2c: copy
	public Rectangle(Rectangle originalRec) {
//		x1 = originalRec.x1;
//		y1 = originalRec.y1;
//		x2 = originalRec.x2;
//		y2 = originalRec.y2;
		this(originalRec.x1,originalRec.y1,originalRec.x2,originalRec.y2);
	}
}
















