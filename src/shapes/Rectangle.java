package shapes;


public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return 4 * this.length;
    }

    public double getPerimeter() {
        return 2 * (Math.pow(length, 2));
    }

}

