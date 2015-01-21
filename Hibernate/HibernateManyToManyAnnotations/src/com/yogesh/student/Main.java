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

			Set<Course> courses = new HashSet<Course>();
			courses.add(new Course("Information Management"));
			courses.add(new Course("Computer Science"));

			Student student1 = new Student("Yogesh", courses);
			Student student2 = new Student("Stefan", courses);
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

