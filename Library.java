package service;

import java.util.HashMap;
import entity.*;
public class Library {
     HashMap<String,Book>books;
     HashMap<String,Member>memebers;
	public Library() {
		books=new    HashMap<String,Book>();
		memebers=new  HashMap<String,Member>();
	}
     public void addBook(Book book) {
    	 books.put(book.getTitle(),book);
    	 System.out.println("book added succesfully");
    	 
     }
     public void removeBook(String title) {
    	books.remove(title);
    	 System.out.println("book removed succesfully");
    	 
     }
     public void removeMember(String memberID ) {
     	memebers.remove(memberID);
     	 System.out.println("memeberremoved succesfully");
     	 
      }
     
     public book searchBookbyTiltle(String title) {
    	 memebers.put(memebers.getMemberID(),memebers)
     }
     public void displayAllBooks() {
    	 System.out.println("alll books in lib");
    	 for(Book book:books.values());
     }
     public void borrowBooks(String memberID,String )
     
     
}
