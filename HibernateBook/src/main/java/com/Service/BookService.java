package com.Service;

import java.util.List;

import com.Dao.BookDao;
import com.Entity.Book;

public class BookService {
	
	
	BookDao dao=new BookDao();
	
	
	public String insert(Book book) {
		
		return dao.insertBook(book);
	}
	
	
	
	public Book get(int id) {
		
		return dao.getBook(id);
	}
	
	
	
	public String update(Book book) {
		
		return dao.updateBook(book);	
	}
	
	
	
	public List<Book> getAll(){
		
		return dao.getAllBooks();
	}
	
	
	public String delete(int id) {
		
		return dao.deleteBook(id);
	}
	
	
	
	
	
	
	
	
	

}
