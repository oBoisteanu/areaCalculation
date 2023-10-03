public class Circle {
    public int radius;
    public double pi = 3.14159;

    public double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = radius * pi;
    }

    public void printCalculations() {
        System.out.println("The area of circle is: " + area);
    }
}


