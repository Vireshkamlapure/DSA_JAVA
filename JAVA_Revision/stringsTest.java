package javaRev;

import java.util.Locale;

public class stringsTest {
    public static void main(String[] args) {
        String s1 = "hello" ;//literal
        String s2 = "hello";
        String s3 = new String("hello"); //constructor

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = s3.toUpperCase();
        System.out.println(s4);

        String text = "hello world";
        //length
        System.out.println(text.length());
        //access character
        System.out.println(text.charAt(0));
        //substring
        System.out.println(text.substring(0, 5));
        //contains
        System.out.println(text.contains("e"));
        //startsWith
        System.out.println(text.startsWith("h"));
        //endsWith
        System.out.println(text.endsWith("o"));
        //replace
        String newString = text.replace("world","java");
        System.out.println(newString);
    }
}
