import java.util.Scanner;

public class Persona extends Proton {
    private String bigboot, Type, color;
    private int Price;
    Persona() {
        this.bigboot = "Big boot";
        this.color = "color";
    }
    public void printcolor() {
        System.out.println("Please enter the color: ");
        Scanner in = new Scanner(System.in);
        String color = in.next();
    }
    public void printBoot() {
        System.out.println("Features : "+bigboot);
    }
    public void setType(String newType) {
        Type = newType;
    }
    public String getType() {
        return Type;
    }
    void run() {
        System.out.println("Proton Persona is running");
    }
    public void printPrice() {
        System.out.println("Price = RM. 108.679.457,14");
    }
}