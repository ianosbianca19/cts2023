import java.util.Vector;

public class User {
    private String name;
    private Vector<String> fileData;
    private Vector<String> database;

    public User(String name) {
        this.name = name;
        this.fileData = new Vector<>();
        this.database = new Vector<>();
    }

    public void writeFileData() {
        // implementarea metodei de scriere a datelor în fișier
        // ...
    }

    public void readDatabase() {
        // implementarea metodei de citire a bazei de date
        // ...
    }

    public void writeToDatabase() {
        // implementarea metodei de scriere a datelor în baza de date
        // ...
    }

    public void makePayment() {
        // implementarea metodei de efectuare a plăților
        // ...
    }

    public Vector<String> getDatabase() {
        return this.database;
    }
}

