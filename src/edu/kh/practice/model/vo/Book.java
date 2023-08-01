package edu.kh.practice.model.vo;

public class Book {
	
	private int number;
	private String title;
	private String author;
	private int price;
	private String publishing;
	
	public Book() {}
	
	public Book(int number, String title, String author)  {
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public Book(int number, String title, String author, int price, String publishing) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishing = publishing;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publishing=" + publishing + "]";
	}

	
	
	

}
