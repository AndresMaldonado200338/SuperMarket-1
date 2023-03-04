package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class SuperMarket {

    private static final String SUPPPLIER_PATH = "SuperMarket/src/resources/suppliers.txt";
    private static final String PRODUCT_PATH = "SuperMarket/src/resources/products.txt";
    private static final String CUSTOMER_PATH = "SuperMarket/src/resources/customers.txt";
    private static final String CATEGORY_PATH = "SuperMarket/src/resources/categories.txt";
    private ArrayList<Customer> customers;
    private ArrayList<Categories> categories;

    public void createCustomer(int rut, String name, Address address, long number, long number2) {
        Customer customer = new Customer(rut, name, address, number, number2);
        addCustomer(customer);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        try {
            FileWriter fileWriter = new FileWriter(CUSTOMER_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.toString());
            bufferedWriter.append("\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createProduct(int id, String name, double price, int stock, Supplier supplier, Categories category) {
        Product product = new Product(id, name, price, stock, supplier, category);
        addProduct(product);
    }

    private void addProduct(Product product) {
        try {
            FileWriter fileWriter = new FileWriter(PRODUCT_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product.toString());
            bufferedWriter.append("\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createSupplier(int rut, String name, Address address, long number, String webSite) {
        Supplier supplier = new Supplier(rut, name, address, number, webSite);
        addSupplier(supplier);
    }

    private void addSupplier(Supplier supplier) {
        try {
            FileWriter fileWriter = new FileWriter(SUPPPLIER_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(supplier.toString());
            bufferedWriter.append("\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCategories() {
        try {
            FileWriter fileWriter = new FileWriter(CATEGORY_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Categories category : Categories.values()) {
                categories.add(category);
                bufferedWriter.write(category.toString());
                bufferedWriter.append("\n");
                bufferedWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.addCategories();
    }
}
