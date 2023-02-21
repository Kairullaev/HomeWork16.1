package Shapes;

public class Triangle extends Shapes{
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println(a*b/2);
    }
}
