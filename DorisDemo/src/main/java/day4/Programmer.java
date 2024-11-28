package day4;

public class Programmer {
    private String name;
    private static int age;    //->belongs to instance
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    /*
    public returnType methodName(type1 parameter1,type2 parameter2){
        method body;
    }
    returnType: void  /   type
     */
    //no return, no parameter
    public void takeBreak(){
        System.out.println("take a break");
    }

    //has return, no parameter (getter)
    public int generateRandomNumber(){//supplier
        return (int)Math.floor(Math.random()*100);//0~99
    }

    //no return, has parameter
    public void printStars(int row){
        //print several rows of stars
        for (int i = 0; i < row; i++) {
            System.out.println("*****");
        }
    }

    //has return , has parameter
    public int add(int a,int b){
        return a+b;
    }
    //1.does the process make different when you call it in different time->parameter
    //2.does the result of this process make different to the program afterward->returnType

    //method overloading:methods are in the same name but with different(count, type) parameters
    public int add(int a){
        return a+a;
    }
    public int add(String a,String b){
        age= 10;
        return Integer.parseInt(a)+Integer.parseInt(b);
    }

    //return type has nothing to do with overloading
//    public String add(int a){ //4->4hello
//        return a+"hello";
//    }

    //this method belongs to the class,doesn't belong to any instance, but it shares by all instance
    public static void fun1(){   //the method belongs to class, when you have this class, you don't have "this" object
//        this.age = 9;
        System.out.println("hello");
        fun2();
    }

    public static void fun2(){
        System.out.println("world");
    }
}
