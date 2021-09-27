package circle;

public class Circle {
    private double radius=1.0;
    private String color="red";
    protected Circle(){
    }
    protected Circle(double radius){
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }
}
