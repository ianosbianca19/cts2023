package ro.ase.cts.s05.generic;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public Client() {
        prototypes.put("A", new ConcretePrototypeA());
        prototypes.put("B", new ConcretePrototypeB());
    }

    public Prototype create(String type) {
        return prototypes.get(type).clone();
    }
}
