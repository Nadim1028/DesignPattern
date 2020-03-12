package Decorator;

public class Header extends WrapperDecorator {
    public Header(IFile decoratedFile) {
        super(decoratedFile);
    }


    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Removing Header");
        decoratedfile.read();
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        decoratedfile.write();
        System.out.println("Adding Header");
    }

}
