package com.Controller;

import com.Entity.Book;
import com.Service.BookService;

public class BookController {
	
	
	
	BookService service=new BookService();
	
	
	
	public String insert(Book book) {
		
		return service.insert(book);
	}

}
