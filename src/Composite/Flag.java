package Composite;

public class Flag extends CompositeShape {
    @Override
    public void buildShape() {
        System.out.println("Flag is building");
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Circle());
    }
}
