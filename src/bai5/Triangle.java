package bai5;

public class Triangle extends Shape{
    private double sider1, side2, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double sider1, double side2, double side3) {
        this.sider1 = sider1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double sider1, double side2, double side3) {
        super(color, filled);
        this.sider1 = sider1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSider1() {
        return sider1;
    }

    public void setSider1(double sider1) {
        this.sider1 = sider1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        return (sider1 + side2 + side3) / 2;
    }

    public double getPerimeter(){
        return sider1 + side2 + side3;
    }

    @Override
   public String toString(){
        return "Triangle{" + super.toString() + ", sider1=" + sider1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }


}
