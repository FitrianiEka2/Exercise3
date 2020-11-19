import java.util.Scanner;

public class Saga extends Proton {
    private String fuel, Type, color;
    private int Price;
    Saga() {
        this.fuel = "Fuel Consumption";
        this.color = "color";
    }
    public void printcolor() {
        System.out.println("Please enter the color: ");
        Scanner in = new Scanner(System.in);
        String color = in.next();
    }
    public void printfuel() {
        System.out.println("Features : "+fuel);
    }
    public void setType(String newType) {
        Type = newType;
    }
    public String getType() {
        return Type;
    }
    void run() {
        System.out.println("Proton Saga is running");
    }
    public void printPrice() {
        System.out.println("Price = RM. 97.086.981,77");
    }
}
