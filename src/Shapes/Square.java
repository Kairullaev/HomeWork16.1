package Shapes;

public class Square extends Shapes{

    private double a;
    private double b;


    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println(a*b);
    }
}
