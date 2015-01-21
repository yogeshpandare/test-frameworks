package com.yogesh.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yogesh.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address = new Address("Sinhgad Road", "Pune", "MH", "411051");
			Student student = new Student("Yogesh", address);
			session.save(student);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
