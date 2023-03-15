package org.dev.restwebservices.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dev.restwebservices.entity.User;
import org.dev.restwebservices.service.UserService;

public class UserServiceImpl implements UserService{
	
	private static List<User> users=new ArrayList<User>();
	private static int userCount=3;

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	@Override
	public User findOne(int id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

}
