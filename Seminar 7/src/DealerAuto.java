package Automobill;

public class DealerAuto {
    private MasinaElectrica masinaElectrica;
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;

    public DealerAuto(){
        masinaElectrica = new MasinaElectrica();
        masinaFamilie =new MasinaFamilie();
        masinaSport = new MasinaSport();
    }

    public void derscrieMasinaElectrica(){
        masinaElectrica.descriere();
    }
    public void descrieMasinaFamilie(){
        masinaFamilie.descriere();
    }
    public void descrieMasinaSport(){
        masinaSport.descriere();
    }
}
