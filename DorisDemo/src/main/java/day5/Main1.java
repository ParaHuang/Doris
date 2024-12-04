package day5;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        //1.type[] name = new type[length];
        int[] arr1 = new int[5];
        //2.type[] name = new type[]{value1,value2,value3,value4};
        int[] arr2 = new int[]{67,44,22,88};
        //3.type[] name = {value1,value2,value3,value4};
        int[] arr3 = {67,44,22,88};

        //access array element by name[index]  ,  index:0~length-1
        arr1[0] = 12;
        arr1[1] = 22;
        arr1[2] = 89;
        arr1[3] = 33;
        arr1[4] = 56;
        //access array with loop
        /*
        for(int i=0 ; i<name.length ; i++){
            //access every element by   name[i]
        }
         */
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1,101);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

//        int[] arr4 = arr3;
        //create a new array, which has the same length as arr3
        int[] arr4 = new int[arr3.length];
        //set up every value of arr4 as the value of arr3
        for(int i=0 ; i<arr4.length ; i++){
            arr4[i] = arr3[i];
        }

        arr4[0] = -100;
        System.out.println("here are the values in arr4:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        System.out.println("here are the values in arr3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        //primitive type:int short long   double float   boolean byte char
        //for all the reference type:String, array, every class
    }

}
