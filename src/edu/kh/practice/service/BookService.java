package edu.kh.practice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Book> library = new ArrayList<Book>();
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		library.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		library.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		library.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		library.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		library.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
	}
	
	public void displayMenu() {
		
		try {
			
			int menuNum = 0;
			do {

				System.out.println("===도서 목록 프로그램===");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천 도서");
				System.out.println("0. 프로그램 종료");
				
				System.out.print("메뉴를 입력하세요 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : System.out.println(addBook()); break;
				case 2 : bookList(library); break;
				case 3 : System.out.println(editBook()); break;
				case 4 : System.out.println(deleteBook()); break;
				case 5 : System.out.println(addFavorite()); break;
				case 6 : System.out.println(deleteFavorite()); break;
				case 7 : bookList(favList); break;
				case 8 : recommendedBook(); break;
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("잘못 입력하셨습니다.메뉴에 있는 번호를 입력해주세요"); break;
				}
				
				
			} while(menuNum != 0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/** 도서 등록 메서드
	 * @return
	 */
	public String addBook() {
		
		System.out.println("======도서 등록========");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String name = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook =  new Book(bookNum, name, writer, price, publisher);
		
		library.add(newBook);
		
		return "등록 완료";
	}
	
	
	/** 도서 목록 조회용 메서드
	 * 
	 */
	public void bookList(List<Book> list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요");
		} else {
			
			for(Book temp : list) {
				System.out.println(temp);
			}
		}
		
	}
	

	/** 도서 수정용 메서드
	 * @return
	 */
	public String editBook() {
		bookList(library);
		
		int editMenu = 0;
		
		System.out.println("========도서 수정========");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		
		for( Book temp : library ) {
			
			if( temp.getBookNum() == bookNum ) {
				flag = false; 
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				// 번호를 받고 번호에 맞는 값 수정
				editMenu = sc.nextInt();
				sc.nextLine();
				
				switch(editMenu) {
				case 1 : System.out.println("==도서명 수정==");
				System.out.print("수정할 도서명을 입력하세요 : ");
				String name = sc.nextLine();
				temp.setName(name);
				break;
				
				case 2 : System.out.println("==도서 저자 수정==");
				System.out.print("수정할 저자명을 입력하세요 : ");
				String writer = sc.nextLine();
				temp.setWriter(writer);
				break;
				
				case 3: System.out.println("=====도서 가격 수정====="); 
				System.out.print("수정할 가격을 입력하세요 : ");
				int price = sc.nextInt();
				temp.setPrice(price);
				break;
				
				case 4: System.out.println("=====도서 출판사 수정====="); 
				System.out.print("수정할 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				temp.setPublisher(publisher);
				break;
				
				case 0: System.out.println("종료합니다"); break;
				
				default: System.out.println("잘못 입력하셨습니다.");  break;
				}
			}
			
		}
		
		if(flag) {
			return "일치하는 도서번호가 없습니다";
		}
		
		return "수정 완료";
		
	}
	
	
	/** 도서 삭제용 메서드
	 * @return
	 */
	public String deleteBook() {
		
		System.out.println("=====도서 삭제======");
		
		bookList(library);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for( Book temp : library ) {
			
			if(temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
			
		}
		
		return "삭제 끝";
		
	}
	

	public String addFavorite() {
		
		System.out.println("==== 즐겨 찾기 등록 ====");
		bookList(library);
		System.out.print("등록할 도서 번호 입력 : ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for(Book temp : library) {
			if(temp.getBookNum() == input) {
				favList.add(temp);
				flag = false;
			}
		}
		
		if(flag == true) {
			return "찾는 번호 없다";
		} else {
			return "등록 성공";
		}
		
		
	}
	

	public String deleteFavorite() {
		
		System.out.println("=====즐겨 찾기 삭제=====");
		
		System.out.print("즐겨찾기 삭제할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for(Book temp : favList) {
			if(temp.getBookNum() == input) {
				
				int index = favList.indexOf(temp);
				
				favList.remove(index);
				
				flag = false;
				
				break;
			}
		}
		
		if (flag) {
			return "찾는 번호가 없습니다.";
		}else {
			return "삭제 성공";
		}
	}
	
	
	public void recommendedBook() {
		
		System.out.println("\n===== 추천 도서 =====");
		
		int max = library.size(); // library는 등록된 도서 리스트
		
		int index = (int)(Math.random() * max);
		
		System.out.println(library.get(index).getName());
		
	}
	
//	// 내일 시험 문제 어느정도 풀 수 있는지 테스트하기 위한 문제!
//	[ 문제 ]
//	ArrayList<Student> list = new ArrayList<Student>();
//	
//	list.add( new Student("고길동", 11) );
//	list.add( new Student("김길동", 12) );
//	list.add( new Student("이길동", 14) );
//	list.add("홍길동");
//	
//	for(int i = 0; i <= list.size(); i++) {
//		list.get(i);
//	}
	
//	for(Student std : list) {
//		System.out.println(std);
//	}
	
//	
//	[ 정답 1 ]
//	제네릭으로 Student 객체 타입을 가지고 있기 때문에 list.add("홍길동"); 오답임.
//	-> String 형태로 가져올 수 없음!
//	   list.add ( new Studnet("홍길동", 15) ); 이러한 형식으로 바꿔야 함.
//	   
//	[ 정답 2 ]
//	for문을 돌 때, 0부터 시작하므로 list의 저장된 값까지 돌게되면 저장된 값보다 넘치는 값까지 돌게 되므로
//	for(int i = 0; i <= list.size(); i++) 오답임.
//	-> 범위를 for(int i = 0; i < list.size(); i++)로 변경해야 함!
}
