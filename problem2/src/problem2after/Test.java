package problem2after;

public class Test {
    public static void main(String[] args) {
        Laptop a = new Laptop.Builder("i7")
                .ram(16)
                .ssd(512)
                .backlitKeyboard()
                .accessory("mouse")
                .build();
        System.out.println(a);

        try {
            Laptop b = new Laptop.Builder("i5")
                    .ram(-8)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}