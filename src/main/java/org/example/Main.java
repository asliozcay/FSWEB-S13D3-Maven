package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Mustafa Ali", "Eren", 26, 1.85, false, "Male");
        Person person3 = new Person("Asli", "Ozcay", 26, 1.60, false);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person3.getAge());
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
