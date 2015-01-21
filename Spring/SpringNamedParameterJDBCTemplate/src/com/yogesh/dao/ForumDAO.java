package com.yogesh.dao;

import com.yogesh.domain.Forum;

public interface ForumDAO {

	public void insertForum(Forum forum);
	public Forum selectForum(int forumId);
	
}

