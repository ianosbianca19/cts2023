public class Server {
    int portNb;
    String name;
    private static Server instance;
    boolean isInstanceAccessed;
    private Server(){}
    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
            instance.isInstanceAccessed = true;
            return Server.instance;
        }
        else {
            instance.isInstanceAccessed = true;
            return Server.instance;
        }
    }

        //verificare instanta -> a fost accesata anterior
        //daca este prima accesare -> Server.instance = new Server(); return Server.instance;
        //daca nu e prima accesare -> return Server.instance
}

//Testare instantiere
//preluare instance  Singleton