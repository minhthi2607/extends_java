package bai2;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.0, "blue");
        System.out.println(c);
        System.out.println("Area = " + c.getArea());

        Cylinder cy = new Cylinder(3.0, 5.0, "green");
        System.out.println(cy);
        System.out.println("Volume = " + cy.getVolume());
    }
}
