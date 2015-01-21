package com.yogesh.service;

import java.util.List;

import com.yogesh.domain.Community;
import com.yogesh.domain.Country;
import com.yogesh.domain.User;

public interface UserService {

	public void add(User user);
	public List<Country> getAllCountries();
	public List<Community> getAllCommunities(); 
}
