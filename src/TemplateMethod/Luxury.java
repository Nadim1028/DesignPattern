package TemplateMethod;

public class Luxury extends TourPackage {
    @Override
    void jabo() {
        System.out.println("Going by a plane.");
    }

    @Override
    void ghurbo() {
        System.out.println("Sight-seeing with best advantage");

    }

    @Override
    void firbo() {
        System.out.println("Coming back by plane");

    }

    public  void  bbqParty()
    {
        System.out.println("BBQ party");
    }
}
