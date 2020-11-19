import java.util.Scanner;

public class Proton {
private String Brand, Window, Headlight;
private int Tyre;

    Proton() {
        Brand = "Dunlop";
        Tyre = 18;

    }

    Proton(String w, String h) {
        Window = w;
        Headlight = h;

    }
    public void printProton() {
        Proton obj1 = new Proton();
        Proton obj2 = new Proton("Up", "On");
        Proton obj3 = new Proton("Down", "Off");

        System.out.println("Tyre Brand : "+obj1.Brand+ "\nTyre Size : "+obj1.Tyre);
        System.out.println("Window : "+obj2.Window+ "\nHeadlight : "+obj2.Headlight);
        System.out.println("Window : "+obj3.Window+ "\nHeadlight : "+obj3.Headlight);
    }
}
