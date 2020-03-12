package Decorator;

public class TestMain
{
    public static void main(String[] args) {
        IFile compress =new Header(new Encryption(new Compress(new GeneralFile()))) ;
        compress.read();
        compress.write();
    }
}
