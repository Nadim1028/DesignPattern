package Decorator;

public class Compress extends WrapperDecorator {
    public Compress(IFile decoratedFile) {
        super(decoratedFile);
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Decompressing");
        decoratedfile.read();
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        decoratedfile.write();
        System.out.println("Compressing");
    }
}
