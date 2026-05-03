package com.Dao;

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
		
		
		
		
		
		
		
		
		
	

}
