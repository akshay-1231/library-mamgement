package entity;

import java.util.ArrayList;

public class Member {
   String name;
   static long id=1000;
   String memberID;
   ArrayList<Book> borrowedBooks;
public Member(String name) {
	super();
	this.name = name;
	this.memberID="LIB"+ ++id;
	borrowedBooks=new ArrayList<Book>();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMemberID() {
	return memberID;
}
public ArrayList<Book> getBorrowedBooks() {
	return borrowedBooks;
}
public void borrowedBooks(Book book) {
	if(book.isAvilable()) {
		borrowedBooks.add(book);
		book.setAvilabilty(false);
		System.out.println(this.name+"borrowed book"+book.getTitle());
	}
	else {
		System.out.println("THIS BOOK NOT AVILABLE");
	}
}
public void removeBooks(Book book) {
	if(borrowedBooks.contains(book)) {
		borrowedBooks.remove(book);
		book.setAvilabilty(true);
		System.out.println(this.name+"return book"+book.getTitle());
	}
	else {
		System.out.println("THIS BOOK NOT AVILABLE");
	}
} 
   
   
   
   
}
