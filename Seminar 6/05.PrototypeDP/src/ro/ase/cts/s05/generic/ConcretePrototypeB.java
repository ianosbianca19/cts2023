package ro.ase.cts.s05.generic;

public class ConcretePrototypeB implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
