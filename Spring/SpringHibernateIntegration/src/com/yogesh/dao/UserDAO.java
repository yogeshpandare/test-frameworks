package com.yogesh.dao;

import java.util.List;
import com.yogesh.domain.User;

public interface UserDAO {
	
	public void saveUser(User user) ;
	public List<User> listUser() ;
}
