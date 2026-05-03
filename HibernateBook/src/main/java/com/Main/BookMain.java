package com.Main;

import com.Controller.BookController;
import com.Entity.Book;

public class BookMain {
	
	
	
	public static void main(String[] args) {
		
		
		
		BookController controller=new BookController();
		
		
		
//		System.out.println(controller.insert(new Book(0, "Shyam chi Aai", 250, "Sane Guruji", 90, "2023-01-22", "2099-19-10")));
		
		System.out.println(controller.get(52));
		
		
		
		
		
	}

}
