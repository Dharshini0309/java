package pck1;
import pck2.demo1;

public class demo {
    public static void main(String[] args) {
        demo1 d = new demo1();
        System.out.println("Outside the package");
        d.display();
    }
    
}
