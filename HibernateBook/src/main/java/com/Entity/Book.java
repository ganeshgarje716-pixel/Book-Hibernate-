package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique=true)
	private String name;
	
	private int price;
	
	private String author;
	
	@Column(name="Quantity")
	private int qty;
	
	@Column(name="Manufacture Date")
	private String mfgDate;
	
	@Column(name="Expiry Date")
	private String ExDate;

	
	
	
	public Book(int id, String name, int price, String author, int qty, String mfgDate, String exDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = qty;
		this.mfgDate = mfgDate;
		ExDate = exDate;
	}
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
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



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getMfgDate() {
		return mfgDate;
	}



	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}



	public String getExDate() {
		return ExDate;
	}



	public void setExDate(String exDate) {
		ExDate = exDate;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", qty=" + qty
				+ ", mfgDate=" + mfgDate + ", ExDate=" + ExDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
