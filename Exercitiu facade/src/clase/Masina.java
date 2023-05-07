package clase;

// Clasa principala a "facade"-ului
public class Masina {
    private Motor motor;
    private CutieDeViteze cutieDeViteze;
    private SistemDeFrane sistemDeFrane;

    public Masina() {
        this.motor = new Motor();
        this.cutieDeViteze = new CutieDeViteze();
        this.sistemDeFrane = new SistemDeFrane();
    }

    public void porneste() {
        motor.porneste();
        cutieDeViteze.puneInViteza(1);
        System.out.println("Masina a pornit!");
    }

    public void opreste() {
        sistemDeFrane.incepeFranele();
        cutieDeViteze.puneInViteza(0);
        motor.opreste();
        System.out.println("Masina s-a oprit!");
    }

    public void accelereaza() {
        cutieDeViteze.maresteViteza();
        motor.cresteTuratia();
        System.out.println("Masina accelereaza!");
    }

    public void franeaza() {
        cutieDeViteze.micsoreazaViteza();
        sistemDeFrane.incepeFranele();
        motor.scadeTuratia();
        System.out.println("Masina franeaza!");
    }
}
