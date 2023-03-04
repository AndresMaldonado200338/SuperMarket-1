package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int stock;
    private Supplier supplier;
    private Categories category;
    final String PATH = "SuperMarket/src/resources/Customers.txt";

    public Product(int id, String name, int price, int stock, Supplier supplier, Categories category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.supplier = supplier;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Supplier getCustomer() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Producto [id= " + id + ", nombre= " + name + ", precio= " + price + ", stock= " + stock
                + ", distribuidor= " + supplier
                + "Categoria= " + category + "]";
    }
}
