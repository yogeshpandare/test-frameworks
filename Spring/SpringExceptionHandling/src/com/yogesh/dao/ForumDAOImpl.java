package com.yogesh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.yogesh.domain.Forum;

public class ForumDAOImpl implements ForumDAO {

	private SimpleJdbcTemplate simpleJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	@Override
	public void insertForum(Forum forum) {
		String query = "INSERT INTO FORUMS_3 (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (?,?,?)";
		simpleJdbcTemplate.update(query, forum.getForumId(), forum
				.getForumName(), forum.getForumDesc());
	}

	@Override
	public Forum selectForum(int forumId) {
		String query = "SELECT * FROM FORUMS_3 WHERE FORUM_ID=?";
		return simpleJdbcTemplate.queryForObject(query,
				new ParameterizedRowMapper<Forum>() {
					@Override
					public Forum mapRow(ResultSet resultSet, int rowNum)
							throws SQLException {
						return new Forum(resultSet.getInt("FORUM_ID"),
								resultSet.getString("FORUM_NAME"), resultSet
										.getString("FORUM_DESC"));
					}
				}, forumId);
	}

}
