package com.Main;

import com.Controller.BookController;
import com.Entity.Book;

public class BookMain {
	
	
	
	public static void main(String[] args) {
		
		
		
		BookController controller=new BookController();
		
		
		
		System.out.println(controller.insert(new Book(1, "Geeta", 200, "Ved Vyas", 20, "2009-12-11", "2033-12-11")));
		
		
		
		
		
	}

}
