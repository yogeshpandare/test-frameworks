package com.yogesh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.domain.Forum;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ForumDAO forumDAO = (ForumDAO) context.getBean("forumDAO");
		Forum springForum = new Forum(3,"Yogesh Pandare", "Will tell you about LIFE!!");
		forumDAO.insertForum(springForum);		
		System.out.println(forumDAO.selectForum(1));		
	}
	
}