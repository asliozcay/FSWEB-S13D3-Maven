package org.example;

public class Wall {
    double width;
    double height;
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double setWidth(double number){
        if (number<0){
            return width = 0;
        }
        return width = number;
    }
    public double setHeight(double number){
        if (number<0){
            return height = 0;
        }
        return height = number;
    }
    public double getArea(){
        return width * height;
    }
    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}
