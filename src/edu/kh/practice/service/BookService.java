package edu.kh.practice.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.practice.model.vo.Book;

public class BookService {
	
//	private Scanner sc = new Scanner(System.in);
//	
//	private List<Book> bookList = new ArrayList<Book>();
//	private List<Book> favoriteList = new ArrayList<Book>();
//	
//	public BookService() {
//		
//		bookList.add( new Book(1111, "용의자 X의 헌신", "히가시노게이고", 15120, "재인 출판사") );
//		bookList.add( new Book(2222, "책1", "저자1", 300000, "유진 출판사") );
//		bookList.add( new Book(3333, "책2", "저자2", 45000, "승준 출판사") );
//		bookList.add( new Book(4444, "책3", "저자3", 90000, "미애 출판사") );
//	}
//	
//	public void displayMenu() {
//		
//		int menuNum = 0;
//		
//		do {
//			
//			System.out.println("===== 도서 목록 프로그램 =====");
//			System.out.println("1. 도서 등록");
//			System.out.println("2. 도서 조회");
//			System.out.println("3. 도서 수정");
//			System.out.println("4. 도서 삭제");
//			System.out.println("5. 즐겨찾기 목록");
//			
//			System.out.println("0. 프로그램 종료");
//			
//			System.out.print("메뉴 번호 입력 >> ");
//			
//			try {
//				
//			menuNum = sc.nextInt();
//			
//			switch(menuNum) {
//			case 1: System.out.println( addBook() ); break;
//			case 2: selectAllBook(); break;
//			case 3: System.out.println( updateBook() ); break;
//			case 4: System.out.println( removeBook() ); break;
//			case 5: System.out.println( favoriteBook() ); break;
//			case 0: System.out.println("프로그램 종료..."); break;
//			default: System.out.println("메뉴에 있는 번호만 입력해주세요.");
//			}
//			
//			} catch(InputMismatchException e) {
//				 System.out.println("\n형식에 맞게 입력해주세요.\n");
//				 
//				 menuNum = -1;
//				 
//			} catch(Exception e) {
//				System.out.println("\n예외가 발생했습니다.\n");
//				
//			}
//			
//		} while( menuNum != 0);
//		
//	}
//	
//	/**
//	 * 1. 도서 등록 메소드
//	 */
//	public String addBook() throws InputMismatchException{
//		
//		System.out.println("===== 1. 도서 등록 =====");
//		
//		System.out.print("도서 번호 : ");
//		int number = sc.nextInt();
//		
//		System.out.print("도서 제목 : ");
//		String title = sc.nextLine();
//		sc.nextLine();
//		
//		System.out.print("도서 저자 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("도서 가격 : ");
//		int price = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("도서 출판사 : ");
//		String publishing = sc.nextLine();
//		
//		if( bookList.add( new Book(number, title, author, price, publishing) ) ) {
//			
//			return "성공";
//		} else {
//			
//			return "실패";
//		}
//	}
//	
//	
//	/**
//	 * 2. 도서 조회 메소드
//	 */
//	public void selectAllBook() {
//		
//		System.out.println("===== 2. 도서 조회 =====");
//		
//		if(bookList.isEmpty()) {
//			System.out.println("등록된 도서 정보가 없습니다.");
//			return;
//		}
//		
//		int index = 0;
//		
//		for(Book bookList : bookList) {
//			System.out.print( (index++) + "번째 : " );
//			System.out.println(bookList);
//		}
//	}
//	
//	/**
//	 * 3. 도서 수정 메소드
//	 */
//	public String updateBook() throws InputMismatchException{
//		
//		System.out.println("===== 3. 도서 수정 =====");
//		
//		System.out.print("수정할 도서 인덱스 번호 입력 : ");
//		int index = sc.nextInt();
//		
//		if(bookList.isEmpty()) {
//			return "등록된 도서 정보가 없습니다.";
//			
//		} else if(index < 0) {
//			return "인덱스는 음수를 입력할 수 없습니다.";
//			
//		} else if(index >= bookList.size()) {
//			return "인덱스는 bookList의 범위를 벗어날 수 없습니다.";
//			
//		} else {
//			
//			System.out.println(index + "번째 도서 정보");
//			System.out.println(bookList.get(index));
//			
//			System.out.print("도서 번호 : ");
//			int number = sc.nextInt();
//			
//			System.out.print("도서 제목 : ");
//			String title = sc.nextLine();
//			sc.nextLine();
//			
//			System.out.print("도서 저자 : ");
//			String author = sc.nextLine();
//			
//			System.out.print("도서 가격 : ");
//			int price = sc.nextInt();
//			sc.nextLine();
//			
//			System.out.print("도서 출판사 : ");
//			String publishing = sc.nextLine();
//			
//			Book temp = bookList.set(index, new Book(number, title, author, price, publishing));
//
//			return temp.getTitle() + " 제목의 도서 정보가 수정되었습니다.";
//		}
//	}
//	
//	
//	/**
//	 * 4. 도서 삭제 메소드
//	 */
//	public String removeBook() {
//		
//		System.out.println("===== 4. 도서 삭제 =====");
//		
//		System.out.print("삭제할 도서 인덱스 번호 입력 : ");
//		int index = sc.nextInt();
//		
//		if(bookList.isEmpty()) {
//			return "등록된 도서 정보가 없습니다.";
//			
//		} else if(index < 0) {
//			return "인덱스는 음수를 입력할 수 없습니다.";
//					
//		} else if(index >= bookList.size()) {
//			return "인덱스는 bookList의 범위를 벗어날 수 없습니다.";
//					
//		} else {
//			
//			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
//			char ch = sc.next().toUpperCase().charAt(0);
//			
//			if(ch == 'Y') {
//				Book temp = bookList.remove(index);
//				return temp.getTitle() + " 제목의 도서 정보가 삭제되었습니다.";
//				
//			} else {
//				return "취소";
//				
//			}
//		}
//	}
//	
//	
//	/**
//	 * 5. 즐겨찾기 목록 메소드
//	 */
//	public String favoriteBook() {
//		
//		System.out.println("===== 5. 즐겨찾기 목록 =====");
//		
//		System.out.print("즐겨찾기할 도서 인덱스 번호 입력 : ");
//		int index = sc.nextInt();
//		
//		if( favoriteList.add( new Book() ) ) {
//			
//			return "성공";
//		} else {
//			
//			return "실패";
//		}
//	}
	
	
	
	
}
