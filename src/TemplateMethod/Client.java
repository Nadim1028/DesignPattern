package TemplateMethod;

public class Client {
    public static void main(String[] args) {
      /*  Luxury l= new Luxury();
        l.hire();
    */

      TourPackage p = new Luxury();
      p= new Delux();
      p.hire();

      p=new Luxury();
      p.hire();

    ((Luxury) p).bbqParty();
    }
}
