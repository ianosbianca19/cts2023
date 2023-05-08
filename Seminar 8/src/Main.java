public class Main {
    public static void main(String[] args) {
        //Creeaza un abonament de baza
        Subscription subscription = new BasicSubscription();

        //Adauga optiune de vizionare offline
        subscription = new OfflineViewingDecorator(subscription);

        //Adauga optiune de vizionare in calitate HD
        subscription = new HDStreamingDecorator(subscription);

        //Afiseaza descrierea si pretul final al abonamentului
        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());
    }
}