package Decorator;

public class Encryption extends WrapperDecorator {
    public Encryption(IFile decoratedFile) {
        super(decoratedFile);
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Decrypted");
        decoratedfile.read();
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        decoratedfile.write();
        System.out.println("Encrypted");
    }
}
