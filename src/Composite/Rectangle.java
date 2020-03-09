package Composite;

public class Rectangle extends CompositeShape {
    @Override
    public void buildShape() {
        System.out.println("Build the Rectangle");
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());

    }
}
