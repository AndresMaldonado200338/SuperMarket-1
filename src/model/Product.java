package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    private int id;
    private String name;
    private int price;
    private int stock;
    private Customer customer;
    private Categories category;
    final String PATH = "SuperMarket/src/resources/Customers.txt";

    public Product(int id, String name, int price, int stock, Customer customer, Categories category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.customer = customer;
        this.category = category;
    }

    public void write() {
        File file = new File(PATH);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(toString() + "\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
                + ", distribuidor= " + customer
                + "Categoria= " + category + "]";
    }
}
