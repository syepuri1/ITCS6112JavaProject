package com.event.management.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.event.management.advice.EventManagementException;
import com.event.management.dao.UsersDao;
import com.event.management.model.Users;
import com.event.management.repository.UsersRepository;

@Repository
public class UserDaoImpl implements UsersDao {

	@Autowired
	private UsersRepository repository;

	@Override
	public Users register(Users user) {
		Users existing = repository.getUserByEmail(user.getEmail());
		if (existing != null)
			throw new EventManagementException("User is already exist please use another email");
		repository.save(user);
		return user;
	}

	@Override 
	public Users getUserByEmail(String email) {
		return repository.getUserByEmail(email);
	}
}
