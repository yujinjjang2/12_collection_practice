package edu.kh.practice.model.vo;

public class Book {
	
	private String name; // 책제목
	private String writer; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int bookNum; // 책번호
	
	public Book() {}

	public Book(int bookNum, String name, String writer, int price, String publisher) {
		super();

		this.bookNum = bookNum;
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + name + " / 도서저자 : " + writer + " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]";	
	}
	
	
}
