package ro.ase.cts.s05.generic;

public class ConcretePrototypeA implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeA();
    }
}
