package com.example.lab2;

public class Fruit implements Comparable<Fruit>{
	private int no;
	private String name;
	private int price;
	
	public Fruit() {}
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}
