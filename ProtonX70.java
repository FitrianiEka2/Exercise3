import java.util.Scanner;

public class ProtonX70 extends Proton {
    private String AutoDrive, Type, color;
    private int Price;

    ProtonX70() {
        this.AutoDrive = "Auto Drive";
        this.color = "color";
    }
    public void printcolor() {
        System.out.println("Please enter the color: ");
        Scanner in = new Scanner(System.in);
        String color = in.next();
    }
    public void printAutoDrive() {
        System.out.println("Features = Auto Drive");
    }
    public void setType(String newType) {
        Type = newType;
    }
    public String getType() {
        return Type;
    }
    void run() {
        System.out.println("Proton X70 is running");
    }
    public void printPrice() {
        System.out.println("Price = RM. 1.004.198.179,14");
    }
}
