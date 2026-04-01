package javaRev.operators;

public class arithmeticOperators {
    public static void main(String[] args) {
        int a = 5+3;
        a+=5;
        System.out.println("a = "+a);
        int b = 5-3;
        System.out.println("b = "+b);
        int c = 5*3;
        System.out.println("c = "+c);
        int d = 9/3; //integar division
        System.out.println("d = "+d);
        double e = 10/3.0f;//floating point division
        System.out.println("e = "+e);
        int f = 10%3; //modules
        System.out.println("f = "+f);

        System.out.println(a);
        a++;//post increment operator
        System.out.println(a);
        a--;//post decrement operator
        System.out.println(a);
        ++a;//pre increment operator
        System.out.println(a);
        --a;//pre decrement operator
        System.out.println(a);

        int z = 1;
        System.out.println(++z + z--);

    }
}
