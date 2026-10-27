package problem2after;

public class TestPreset {
    public static void main(String[] args) {
        PresetRegistry registry = new PresetRegistry();

        Laptop i5Laptop = new Laptop.Builder("i5").ram(8).build();
        Quote studentPreset = new Quote(i5Laptop).addService("Setup");
        registry.register("student", studentPreset);

        Quote quote1 = registry.create("student")
                .forCustomer("SAFI Amal")
                .addService("Extended warranty");

        Quote quote2 = registry.create("student")
                .forCustomer("ALAMI Samir");

        System.out.println(quote1);
        System.out.println(quote2);
        System.out.println(quote1.getLaptop() == quote2.getLaptop());
    }
}