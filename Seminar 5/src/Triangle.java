public class Triangle extends Shape {
    private double line1;
    private double line2;
    private double line3;
    public Triangle(double line1, double line2, double line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }
    public double getLine1() {
        return line1;
    }
    public double getLine2() {
        return line2;
    }
    public double getLine3() {
        return line3;
    }
    public double area() { //Heron
        double s = (line1 + line2 + line3) / 2; //semiperimetru
        return Math.sqrt(s * (s - line1) * (s - line2) * (s - line3));
    }
    public double perimeter() {
        return line1 + line2 + line3;
    }
}
