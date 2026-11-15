class Shape {
    double calculateArea() { return 0; }
}
class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    @Override
    double calculateArea() { return 3.14 * radius * radius; }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    @Override
    double calculateArea() { return length * width; }
}
class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
