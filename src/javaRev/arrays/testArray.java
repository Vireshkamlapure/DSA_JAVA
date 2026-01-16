package javaRev.arrays;

public class testArray {
    public static void main(String[] args) {
         int[] a; //declaration
         int[] arr = new int[5]; //declaration + creation
         float[] flarr = {1.2f,3.4f,5.6f,7.8f}; // declaration + creation + initialization
         //_,_,_,_,_
        arr[4] = 55;
        System.out.println(arr[4]);

        //for each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
