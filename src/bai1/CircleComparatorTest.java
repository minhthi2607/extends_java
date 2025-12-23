package bai1;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle("indigo", true, 3.5);

        System.out.println("Pre-sorted: ");
        for (Circle c : circle) {
            System.out.println(c);
        }

        CircleComparator cc = new CircleComparator();
        Arrays.sort(circle, cc);

        System.out.println("After-sorted: ");
        for (Circle c : circle) {
            System.out.println(c);
        }

    }
}
