package com.event.management.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.dao.UsersDao;
import com.event.management.repository.UsersRepository;

@Service
public class UserDaoImpl implements UsersDao{

	@Autowired
	private UsersRepository repository;
}
