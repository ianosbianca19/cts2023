public class Main {
//    public static void main(String[] args) {
//        Line line = new Line(5);
//        System.out.println("Line length: " + line.getLength());
//        System.out.println("---------------------------");
//
//        Rectangle rectangle = new Rectangle(4, 6);
//        System.out.println("Rectangle area: " + rectangle.area());
//        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
//        System.out.println("---------------------------");
//
//
//        Square square = new Square(7);
//        System.out.println("Square area: " + square.area());
//        System.out.println("Square perimeter: " + square.perimeter());
//        System.out.println("---------------------------");
//
//
//        Triangle triangle = new Triangle(3, 4, 5);
//        System.out.println("Triangle area: " + triangle.area());
//        System.out.println("Triangle perimeter: " + triangle.perimeter());
//    }

    public static void main(String[] args) {
        Server server1 = Server.getInstance();
        System.out.println("Is firsrt instance accessed: " + server1.isInstanceAccessed);

        Server server2 = Server.getInstance();
        System.out.println("Is second instance accessed: " + server2.isInstanceAccessed);

        Server serverInstance = Server.getInstance();
    }

}

//O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa asigure adaugarea si
//modificarea datelor despre masinile fabricate la nivelul sediului central, intr-un mediu securizat
//(Sistemul va exista sub forma unui server dispus in datacenter-ul din HQ). Programatorii trebuie sa se asigure ca sistemul va putea fi replicat
//si ca toate datele vor putea fi manageriate prin intermediul singurului server mentionat anterior

//A car factory that implements a centralized production monitoring system. The system must ensure the addition and modification of data about the machines manufactured at the head office level, in a secure environment (the system will exist in the form of a server located in the data center in HQ). Programmers must ensure that the system can be replicated and that all data can be managed through the single server mentioned previously