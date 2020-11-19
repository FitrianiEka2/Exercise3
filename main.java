
public class main {
    public static void main (String[] args) {

        System.out.println("=====Welcome to Fitriani's Proton Store=====");
        System.out.println("\tAvailable Proton Car type :");

        Persona p = new Persona();
        Saga s = new Saga();
        ProtonX70 x7 = new ProtonX70();
        ProtonX50 x5 = new ProtonX50();

        p.setType("Persona");
        s.setType("Saga");
        x7.setType("X70");
        x5.setType("X50");

        System.out.println("\n\t1. Proton " + p.getType());
        p.printcolor();
        p.printBoot();
        p.printProton();
        p.printPrice();
        p.run();

        System.out.println();
        System.out.println("\t2. Proton " + s.getType());
        s.printcolor();
        s.printfuel();
        s.printProton();
        s.printPrice();
        s.run();

        System.out.println();
        System.out.println("\t3. Proton " + x7.getType());
        x7.printcolor();
        x7.printAutoDrive();
        x7.printProton();
        x7.printPrice();
        x7.run();

        System.out.println();
        System.out.println("\t4. Proton " + x5.getType());
        x5.printcolor();
        x5.printAutoPark();
        x5.printProton();
        x5.printPrice();
        x5.run();
    }
}