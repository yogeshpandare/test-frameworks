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
			Address address1 = new Address("Sinhgad Road", "Pune", "MH", "411051");
			Address address2 = new Address("Ring Road", "Surat", "GJ", "394105");
			Student student1 = new Student("Yogesh", address1);
			Student student2 = new Student("Jignesh", address2);
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
