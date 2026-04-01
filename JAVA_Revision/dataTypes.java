package javaRev;

public class dataTypes {
    public static void main(String[] args) {
        int a = 1;
        byte b = 1;
        short c = 1;
        long d = 1l;
        float e = 3.14f;
        double f = 45.666;
        boolean isAdult = true; // 1 bit
        char var = 'A'; //2 bytes Range : 0-65535
        //common ASCII 0-127
        //
        System.out.println((int) var);
        System.out.println((char) 10083);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("1 byte");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("2 byte");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("4 byte");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("8 byte");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("4 byte floating points");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("8 byte");


        //widening conversion
        //java supports widening conversion (implicit conversion )
        byte byteval = 10;
        short shortval = byteval;
        int intval = shortval;
        long longval = intval;
        float floatval = longval;
        double doubleval = floatval;

        //narrowing conversion
        //data loss
        double newdoubleval = 123.45;
        float newfloatval = (float) newdoubleval;
        long newlongval = (long) newfloatval;
        int newintval = (int) newlongval;

        System.out.println(newdoubleval);
        System.out.println(newfloatval);
        System.out.println(newlongval);
        System.out.println(newintval);
    }
}
