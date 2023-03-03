package model;

public class Person {
	private int rut;
	private String name;
	private Address address;
	private int number;

	public Person(int rut, String name, Address address, int number) {
		this.rut = rut;
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "[Rut= " + rut + ", Nombre= " + name + ", Direccion= " + address + ", Número= " + number + "]";
	}
}
