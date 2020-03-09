package Composite;

public class Triangle extends CompositeShape {
    @Override
    public void buildShape() {
        System.out.println("Build the Triangle");

        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());

    }
}
