package day5;

public class Main2 {
    public static void main(String[] args) {
//    For example, the following piece of code should output the value -4.
        int[] array = {-1, 5, 3, -4, 7, 8, -2};
        System.out.println(minValue(array));
        System.out.println(minAbsoluteValue(array));
    }

    //1.design a method as below, which takes as an integer array as parameter,
    // and it returns the smallest value of the numbers contained in the array.
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
//            compare min with every value 1 by 1,replace min with the smaller value
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

//    2.design a method as below, which takes as an integer array as parameter,
//    and that returns the smallest absolute value of the numbers contained in the array.
    public static int minAbsoluteValue(int[] array){
        int min = Math.abs(array[0]);
        for (int i = 0; i < array.length; i++) {
            //compare min with every absolute value 1 by 1,replace min with the smaller absolute value
            if(min > Math.abs(array[i]) ){
                min = Math.abs(array[i]);
            }
        }
        return min;
    }
}
