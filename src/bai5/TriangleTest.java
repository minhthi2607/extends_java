package bai5;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        triangle = new Triangle("black", true, 3, 4, 5);
        System.out.println(triangle);
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
