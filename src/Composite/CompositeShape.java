package Composite;

import java.util.ArrayList;

public abstract class CompositeShape implements IShape {
    ArrayList<IShape> shapes= new ArrayList<>(100);

    public abstract void buildShape();

    @Override
    public void draw() {
        buildShape();
        for (int i=0;i<shapes.size();i++){
            shapes.get(i).draw();
        }
    }


}
