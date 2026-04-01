package javaRev.operators;

public class bitOperators {
    public static void main(String[] args) {
         int a = 5; //0101
         int b = 3; //0011

//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));

        System.out.println("AND");
        System.out.println(a & b);
        System.out.println(Integer.toBinaryString(a & b));

        System.out.println("OR");
        System.out.println(a | b);
        System.out.println(Integer.toBinaryString(a | b));

        System.out.println("XOR");
        System.out.println(a ^ b);
        System.out.println(Integer.toBinaryString(a ^ b));

        System.out.println("NOT");
        System.out.println((~a));
        System.out.println(Integer.toBinaryString(~a));

        System.out.println("Left Shift");
        System.out.println(a + " " +Integer.toBinaryString(a));
        a = a << 1;
        System.out.println(a +" " +Integer.toBinaryString(a));

        System.out.println("Right Shift");
        System.out.println(a + " " +Integer.toBinaryString(a));
        a = a >> 1;
        System.out.println(a + " " +Integer.toBinaryString(a));
    }
}
