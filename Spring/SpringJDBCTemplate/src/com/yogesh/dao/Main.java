package com.yogesh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.domain.Forum;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ForumDAO forumDAO = (ForumDAO) context.getBean("forumDAO");
		Forum springForum = new Forum(1,"Yogesh Pandare", "Discusses about science & art!!");
		forumDAO.insertForum(springForum);		
		System.out.println(forumDAO.selectForum(1));
		
	}
	
}
