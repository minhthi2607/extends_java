package bai2;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }


    public Cylinder(){
    }

    public double getVolume(){
        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder with " + super.toString() +
                ", height{" + height + "}";
    }

}
