package model;

import java.time.LocalDate;

public class Sale {
    private int id;
    private LocalDate date;
    private Product product;
    private Customer customer;
    private int amount;
    private double discount;
    private double total;

    public Sale(int id, LocalDate date, Product product, Customer customer, int amount, double discount, double total) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.amount = amount;
        this.discount = discount;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public void getProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public double calculateTotal(){
        return this.total = product.getPrice() * amount - discount;
    }

    @Override  
    public String toString() {  
        return "Venta # " + id + "\nFecha " + date + "\nCliente " + customer.getName() + "\nProducto " + product.getName() + "\nCantidad " + amount + "\nDescuento " + discount + "\nTotal a pagar " + total + "\n";  
    }

}
