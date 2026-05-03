package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Config.HibernateConfig;
import com.Entity.Book;

public class BookDao {
	
	
	
	
		
		SessionFactory sf= HibernateConfig.getSessionFactory();
	
		
		
		
		public String insertBook(Book book) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(book);
			
			tr.commit();
			
			session.close();
			
			return "Insert Book";
		}
		
		
		
		public Book getBook(int id) {
			
			Session session = sf.openSession();
			
			Book book = session.get(Book.class, id);
			
			return book;
		}
		
		
		
		public String updateBook(Book book) {
			
		
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Book existing = session.get(Book.class, book.getId());
			
			existing.setName(book.getName());
			existing.setPrice(book.getPrice());
			existing.setAuthor(book.getAuthor());
			existing.setQty(book.getQty());
			existing.setMfgDate(book.getMfgDate());
			existing.setExDate(book.getExDate());
			
			session.update(existing);
			
			tr.commit();
			
			session.close();
			
			return "Book Update";
		}
		
		
		
		
		public List<Book> getAllBooks() {
			
			Session session = sf.openSession();
			
		    List<Book> books=session.createQuery("from Book").list();
		    
		    return books;
		}
		
		
		
		public String deleteBook(int id) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Book book = session.get(Book.class, id);
			
			session.delete(book);
			
			tr.commit();
			
			session.close();
			
			return "Book Delete";
		}
		
		
		
		
		
		
		
		
		
	

}
