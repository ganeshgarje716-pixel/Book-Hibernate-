package com.Service;

import com.Dao.BookDao;
import com.Entity.Book;

public class BookService {
	
	
	BookDao dao=new BookDao();
	
	
	public String insert(Book book) {
		
		return dao.insertBook(book);
	}

}
