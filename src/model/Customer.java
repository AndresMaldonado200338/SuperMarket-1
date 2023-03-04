package model;

public class Customer extends Person{
    long number2;

    public Customer(int rut, String name, Address address, long number, long number2) {
        super(rut, name, address, number);
        this.number2 = number2;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Cliente [ " + super.toString() + ", Otro numero=" + number2 + "]";
    }
}
