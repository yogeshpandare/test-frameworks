package com.yogi.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yogi.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address = new Address("Sinhgad Road", "Pune", "MH", "411051");
			//By using cascade=all option the address need not be saved explicitly when the student object is persisted the address will be automatically saved.
            //session.save(address);
			Student student1 = new Student("Suresh", address);
			Student student2 = new Student("Yogesh", address);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}