package entity;

public class Book {
  String title;
  String  auther;
  String category;
  boolean avilabilty;
  
public Book(String title, String auther, String category) {
	super();
	this.title = title;
	this.auther = auther;
	this.category = category;
	this.avilabilty=true;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuther() {
	return auther;
}

public void setAuther(String auther) {
	this.auther = auther;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public boolean isAvilabilty() {
	return avilabilty;
}

public void setAvilabilty(boolean avilabilty) {
	this.avilabilty = avilabilty;
}
 
public boolean isAvilable() {
	return avilabilty;
}
}
