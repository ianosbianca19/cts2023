import java.util.ArrayList;

enum Category {
    Electronice,
    Electrocasnice
}

class NameTooShortException extends Exception {
    public NameTooShortException() {
        super("name too short exception");
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = null;
        try {
            p1 = new Product("Laptop", 3200.5, Category.Electronice, 1123, "");
        } catch (NameTooShortException e) {
            e.printStackTrace();
        }

        Product p2 = null;
        try {
            p2 = new Product("Frigider", 207.95, Category.Electrocasnice, 1245, "");
        } catch (NameTooShortException e) {
            e.printStackTrace();
        }

        Product p3 = new Product(p1);
        p3.setQty(5);
        p3.setProductName("Paine");

        o.addProductToList(p1);
        o.addProductToList(p2);

        o.removeProductFromList(p1);
        System.out.println(p1.equals(p2));
    }
}

class OnlineShop {
    private String onlineShopName;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>(products);
        this.image = img;
        this.onlineShopName = name;
    }

    public void addProductToList(Product p){
        this.products.add(p);
    }

    public void removeProductFromList(Product p){
        this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private Category category;
    private int qty;
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, Category category, int id, String details) throws NameTooShortException
    {
        if(name.length() < 3) throw new NameTooShortException();
        this.name = name;
        this.price = price;
        this.category = category;
        this.id = id;
        this.details = details;
    }

    public Product(Product p)
    {
        this.name = p.name;
        this.price = p.price;
        this.category = p.category;
        this.id = p.id;
        this.details = p.details;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public boolean equals(Product p)
    {
        if(p.id != this.id)
            return false;
        return true;
    }

    public void decreasePrice(double percentage){
        this.price -= this.price * percentage / 100;
    }

    public void increasePrice(double percentage){
        this.price += this.price * percentage / 100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> cart;

    public User(String username, String id)
    {
        this.username = username;
        this.id = id;
        orders = new ArrayList<Order>();
        cart = new ArrayList<Order>();
    }

    public void addOrder(Order o)
    {
        this.orders.add(o);
    }

    public void addToCart(Order o)
    {
        this.cart.add(o);
    }
}

class Order
{
    private ArrayList<Product> productList;
    private String address;

    public Order()
    {
        productList = new ArrayList<Product>();
    }

    public void add(Product p)
    {
        if(productList.size() > 99)
            return;
        productList.add(p);
    }

    public void remove(Product p)
    {
        productList.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }
}

class Inventory
{
    private Product product;
    private int qty;

    public Inventory(Product product, int qty)
    {
        this.product = new Product(product);
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}