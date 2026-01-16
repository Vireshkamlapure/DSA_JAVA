package javaRev.oops;

public class oops1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();

        Car car1 = new Car("White",180);
        car1.drive();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meon();

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.paws();

        Calculator calculator = new Calculator();

        System.out.println("addition of 5 and 10 is : "+ calculator.add(5,10));

        System.out.println("addition of 5 , 10 and 15 is : "+calculator.add(5,10,15));

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();

    }
}
