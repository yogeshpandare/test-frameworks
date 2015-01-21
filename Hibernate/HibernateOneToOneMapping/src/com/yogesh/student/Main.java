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
			// create address hibernate object.. do not pass id because it is generated 
			Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
			Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
			Student student1 = new Student("Eswar", address1);
			Student student2 = new Student("Joe", address2);
			Student student3 = new Student("John", student1.getStudentAddress());
			// this can be done by spring tempate which requires 
			// tempate.save(student)
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			transaction.commit();
			
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
