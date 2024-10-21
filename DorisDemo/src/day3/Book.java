package day3;

//OOP:object oriented programming
//encapsulation:keep code safe by making fields private,methods public,then access fields by methods
//inheritance
//polimorphism
//class is kind of like a definition of a lot of things in the same category
public class Book {
	//fields/properties/attributes/(instance variables):name,price,type,author
	private String name;
	private double price;
	private String type;
	private String author;
	
	//assign/set a value--> setters  -> setSomething
	//to set a value for name -> 
	public void setName(String n) {
		//whenever you wish the method has some different detail ,we use parameter to control that
		name = n;
	}
	//to set a value for price -> setPrice
	public void setPrice(double p) {
		if(p<=0) {
			System.out.println("invalid price,it's gonna use a default price");
			price = 5;
		}else {
			price = p;
		}
	}
	public void setType(String t) {
		type = t;
	}
	public void setAuthor(String a) {
		author = a;
	}
	//obtain/get a value-> getters  -> getSomething
	//to get the name
	public String getName() {
		return name;
	}
	//to get the price
	public double getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
	//methods/functions(what they can do):read,translate
	public void read() {
		System.out.println("reading a book <"+name+">"+",it's written by "+author);
	}
	public void translate() {
		System.out.println("translating a "+type+" book into Chinese,it's $"+price);
	}

}
