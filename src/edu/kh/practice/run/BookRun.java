package edu.kh.practice.run;

import edu.kh.practice.service.BookService;

public class BookRun {
	
	public static void main(String[] args) {
	
		BookService service = new BookService();
		
		service.displayMenu();
	}

}
