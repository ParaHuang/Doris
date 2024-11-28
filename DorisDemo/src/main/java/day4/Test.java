package day4;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();
        Programmer p3 = new Programmer();

        p1.printStars(3);    //3
        p1.takeBreak();
        int sum1 = p1.add(10,3);
        System.out.println(sum1);
        p2.printStars(6);    //6
        p2.takeBreak();
        p3.printStars(1);    //1
        p3.takeBreak();

        //generate an integer number(0-99), if it's odd, print "I got an odd number, bad luck"
        //otherwise, print "lucky"
        int num = p1.generateRandomNumber();
        if(num%2==0){
            System.out.println("lucky");
        }else{
            System.out.println("unlucky");
        }

        //that number, > 50, big number
        //otherwise, small number
        if(num>50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }

        System.out.println();

        Random random = new Random();
        int r1 = random.nextInt();      //generate a very big random number
        int r2 = random.nextInt(5); //generate a number (0~4)
        int r3 = random.nextInt(10,21);//(10~20)

        random.nextInt();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        p1.add(2);

        Programmer.fun1();  //best way to use static member
//        p1.fun1();
    }
}
