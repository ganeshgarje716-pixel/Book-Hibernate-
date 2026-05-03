package com.Controller;

import java.util.List;

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
	
	
	public List<Book> getAll(){
		
		return service.getAll();
	}
	
	
	
	public String delete(int id) {
		
		return service.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
