package com.yogesh.student;

import java.util.HashSet;
import java.util.Set;

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
			
			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house","2024301709"));
			phoneNumbers.add(new Phone("mobile","9890636360"));
			
			Student student = new Student("Suresh", phoneNumbers);
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
