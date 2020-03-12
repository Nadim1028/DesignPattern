package Decorator;

public class GeneralFile implements IFile {
    @Override
    public void read() {
        System.out.println("reading file");
    }

    @Override
    public void write() {
        System.out.println("writing file");
    }
}
