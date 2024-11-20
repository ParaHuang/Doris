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
		System.out.println("right now, count is:"+count);
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
	
	public int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return ":Rectangle P1("+x1+","+y1+") P2("+x2+","+y2+")";
	}
	
	public boolean isInside(int x, int y){
//		return is x between x1 and x2    and     is y between y1 and y2;
//		return x>x1 && x<x2 && y>y2 && y<y1;
		if(x>=x1 && x<=x2 && y>=y2 && y<=y1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isInside(Rectangle r) {
		if(isInside(r.x1,r.y1) && isInside(r.x2, r.y2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Rectangle union(Rectangle r) {
		if(isInside(r)) {
			return this;
		}else if(r.isInside(this)) {
			return r;
		}else if(isInside(r.x1, r.y1)){
			return new Rectangle(x1, y1, r.x2, r.y2);
		}else if(isInside(r.x2, r.y2)) {
			return new Rectangle(r.x1, r.y1, x2, y2);
		}else if(isInside(r.x2,r.y1)) {//the rightDown point of r is in this rectangle
			return new Rectangle(r.x1,this.y1,this.x2,r.y2);
		}else if(isInside(r.x1,r.y2)) {//the leftTop point of r is in this rectangle
			return new Rectangle(this.x1, r.y1, r.x2, this.y2);
		}else {
			return null;
		}
	}
	
//	public Rectangle intersetion(Rectangle r) {
//		if(isInside(r)) {
//			return r;
//		}else if(r.isInside(this)) {
//			return this;
//		}else if(isInside(r.x1, r.y1)){
//			return new Rectangle(r.x1,r.y1,this.x2,this.y2);
//		}else if(isInside(r.x2, r.y2)) {
//			return new Rectangle(this.x1,this.y2,r.x2,r.y2);
//		}else if(isInside(r.x2,r.y1)) {//the rightDown point of r is in this rectangle
//			return new Rectangle(?,?,?,?);
//		}else if(isInside(r.x1,r.y2)) {//the leftTop point of r is in this rectangle
//			return new Rectangle(?,?,?,?);
//		}else {
//			return null;
//		}
//	}
}
































