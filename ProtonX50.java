import java.util.Scanner;

public class ProtonX50 extends Proton {
    private String AutoPark, Type, color;
    private int Price;

    ProtonX50() {
        this.AutoPark = "Auto Parking";
        this.color = "color";
    }
    public void printcolor() {
        System.out.println("Please enter the color: ");
        Scanner in = new Scanner(System.in);
        String color = in.next();
    }
    public void printAutoPark() {
        System.out.println("Features = Auto Parking");
    }
    public void setType(String newType) {
        Type = newType;
    }
    public String getType() {
        return Type;
    }
    void run() {
        System.out.println("Proton X50 is running");
    }
    public void printPrice() {
        System.out.println("Price = RM. 1.137.511.645,85");
    }
}
