package bai1;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];

        circle[0] = new ComparableCircle(3.6);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle("indigo", true, 3.5);

        System.out.println("Pre-sorted");

        for (ComparableCircle c : circle) {
            System.out.println(c);
        }

        Arrays.sort(circle);

        System.out.println("After-sorted");

        for (ComparableCircle c : circle) {
            System.out.println(c);
        }
    }
}
