package Shapes;

public class Circle extends Shapes{

    private double radiys;

    public Circle(double radiys) {
        this.radiys = radiys;

    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println(radiys*radiys*Math.PI);
    }
}
