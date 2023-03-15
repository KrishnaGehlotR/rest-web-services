package org.dev.restwebservices.service;

import java.util.List;

import org.dev.restwebservices.entity.User;

public interface UserService {

	public List<User> findAll();

	public User save(User user);

	public User findOne(int id);
}
