package clase;

// Clasa pentru CutieDeViteze
class CutieDeViteze {
    private int vitezaCurenta = 0;

    public void puneInViteza(int viteza) {
        this.vitezaCurenta = viteza;
        System.out.println("Masina a fost pusa in viteza " + viteza);
    }

    public void maresteViteza() {
        this.vitezaCurenta++;
        System.out.println("Viteza curenta a masinii a crescut la " + vitezaCurenta);
    }

    public void micsoreazaViteza() {
        this.vitezaCurenta--;
        System.out.println("Viteza curenta a masinii a scazut la " + vitezaCurenta);
    }
}