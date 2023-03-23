public class Line extends Shape {
    private double length;
    public Line(double length) {this.length = length;}
    public double getLength() {
        return length;
    }
    public void setLength(double length) {this.length = length;}
    public double area() {
        return 0;
    }
    public double perimeter() {
        return length;
    }
}