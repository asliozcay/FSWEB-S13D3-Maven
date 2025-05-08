package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    boolean isMarried;
    String gender;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double height, boolean isMarried){
        this(firstName, lastName, age);
        this.height = height;
        this.isMarried = isMarried;
    }
    public Person(String firstName, String lastName, int age, double height, boolean isMarried, String gender){
        this(firstName, lastName, age, height, isMarried);
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        if(age>=13 && age<=19){
            return true;
        }
        return false;
    }
    public String toString(){
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + (height != 0.0 ? ", Height: " + height : "") + ", Married: " + isMarried + (gender != null ? ", Gender: " + gender : "");
    }
}
