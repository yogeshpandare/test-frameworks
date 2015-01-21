package com.yogesh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yogesh.domain.Forum;

public class ForumDAOImpl implements ForumDAO {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertForum(Forum forum) {
		/**
		 * Specify the statement
		 */
		String query = "INSERT INTO FORUMS (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (?,?,?)";
		/**
		 * Specify the values 
		 */
		jdbcTemplate.update(query, new Object[] { Integer.valueOf(forum.getForumId()),
				forum.getForumName(), forum.getForumDesc() });
	}
	
	public Forum selectForum(int forumId) {
		/**
		 * Specify the statement
		 */
		String query = "SELECT * FROM FORUMS WHERE FORUM_ID=?";
		/**
		 * Implement the RowMapper callback interface
		 */
		return (Forum) jdbcTemplate.queryForObject(query, new Object[] { Integer.valueOf(forumId) }, 
				new RowMapper() {
					public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
						return new Forum(resultSet.getInt("FORUM_ID"), resultSet.getString("FORUM_NAME"), 
								resultSet.getString("FORUM_DESC"));
					}
				});
	}

}
