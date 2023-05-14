package Composite;

public class Main {
    public static void main(String[] args){
        Component buton1 = new Button();
        Component buton2 = new Button();
        Component campText = new TextField();

        PanelManager panou = new Panel();
        panou.adaugaComponenta(buton1);
        panou.adaugaComponenta(buton2);
        panou.adaugaComponenta(campText);

        panou.render();
    }
}
