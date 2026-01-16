package javaRev.oops;

public class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks...");
    }
    void sound(){
        System.out.println("Dog barks...");
    }

    @Override
    void sayHello() {
        System.out.println("Hello from dog ");
    }
}
