package project_1;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 5;
        width = 5;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void set_length(double length) {
        this.length = length;
    }

    public void set_width(double width) {
        this.width = width;
    }

    public double get_length() {
        return length;
    }

    public double get_width() {
        return width;
    }

    public double get_area() {
        return length * width;
    }

    public double get_perimeter() {
        return (length + width) * 2;
    }
}