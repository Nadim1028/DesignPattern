package Decorator;

public class WrapperDecorator implements IFile {
    IFile decoratedfile;
    public WrapperDecorator(IFile decoratedFile){
        this.decoratedfile = decoratedFile;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }
}
