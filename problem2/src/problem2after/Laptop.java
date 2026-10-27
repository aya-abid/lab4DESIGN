package problem2after;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private final String cpu;
    private final int ramGb;
    private final int ssdGb;
    private final boolean gpu;
    private final boolean backlitKeyboard;
    private final List<String> accessories;

    // Private constructor called only by the Builder
    private Laptop(Builder builder) {
        this.cpu = builder.cpu;
        this.ramGb = builder.ramGb;
        this.ssdGb = builder.ssdGb;
        this.gpu = builder.gpu;
        this.backlitKeyboard = builder.backlitKeyboard;
        this.accessories = List.copyOf(builder.accessories); // Immutable copy
    }

    // Getters
    public String getCpu() { return cpu; }
    public int getRamGb() { return ramGb; }
    public int getSsdGb() { return ssdGb; }
    public boolean hasGpu() { return gpu; }
    public boolean hasBacklitKeyboard() { return backlitKeyboard; }
    public List<String> getAccessories() { return accessories; }

    @Override
    public String toString() {
        return "Laptop [CPU=" + cpu + ", RAM=" + ramGb + " GB, SSD=" + ssdGb +
                " GB, GPU=" + gpu + ", Backlit=" + backlitKeyboard + ", Accessories=" + accessories + "]";
    }

    public static class Builder {
        private final String cpu;

        private int ramGb = 8;
        private int ssdGb = 256;
        private boolean gpu = false;
        private boolean backlitKeyboard = false;
        private final List<String> accessories = new ArrayList<>();

        public Builder(String cpu) {
            this.cpu = cpu;
        }

        public Builder ram(int ramGb) {
            this.ramGb = ramGb;
            return this;
        }

        public Builder ssd(int ssdGb) {
            this.ssdGb = ssdGb;
            return this;
        }

        public Builder gpu() {
            this.gpu = true;
            return this;
        }

        public Builder backlitKeyboard() {
            this.backlitKeyboard = true;
            return this;
        }

        public Builder accessory(String accessory) {
            this.accessories.add(accessory);
            return this;
        }

        public Laptop build() {
            if (ramGb < 4 || ramGb > 64) {
                throw new IllegalStateException("RAM must be between 4 and 64 GB.");
            }
            if (ssdGb < 128) {
                throw new IllegalStateException("SSD must be at least 128 GB.");
            }
            return new Laptop(this);
        }
    }
}