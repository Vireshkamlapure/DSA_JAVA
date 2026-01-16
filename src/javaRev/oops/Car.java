package javaRev.oops;

public class Car {
    private String color;
    private int speed;

    Car(){
        this.color = "Black";
        this.speed = 120;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Car(String color , int speed){
        this.color = color;
        this.speed = speed;
    }
    void drive(){
        System.out.println("Car is driving.");
        System.out.println("Car color : "+this.color+"\tCar Speed : "+this.speed);
    }
}
