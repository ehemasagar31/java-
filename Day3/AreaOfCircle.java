public class AreaOfCircle {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double r = 5.0;
        System.out.println("Area of circle with radius " + r + " = " + area(r));
    }
}
