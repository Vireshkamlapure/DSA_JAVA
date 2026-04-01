package javaRev.oops;

abstract public class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
    void sound(){
        System.out.println("Animal makes sound...");
    }
    abstract void sayHello();

    void sleep(){
        System.out.println("zzzz.");
    }
}
