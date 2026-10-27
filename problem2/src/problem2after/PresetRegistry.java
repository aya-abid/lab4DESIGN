package problem2after;

import java.util.ArrayList;
import java.util.List;

public class PresetRegistry {
    private final List<String> names = new ArrayList<>();
    private final List<Quote> presets = new ArrayList<>();

    public void register(String name, Quote preset) {
        names.add(name);
        presets.add(preset);
    }

    public Quote create(String name) {
        int index = names.indexOf(name);
        if (index == -1) {
            throw new IllegalArgumentException("Unknown preset: " + name);
        }
        return presets.get(index).copy();
    }
}