package com.Controller;

import com.Entity.Book;
import com.Service.BookService;

public class BookController {
	
	
	
	BookService service=new BookService();
	
	
	
	public String insert(Book book) {
		
		return service.insert(book);
	}
	
	
	
	public Book get(int id) {
		
		return service.get(id);
	}

	
	
	public String update(Book book) {
		
		return service.update(book);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
