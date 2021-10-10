package com.event.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.event.management.dao.UsersDao;

@Component
public class UsersServiceImpl {

	@Autowired
	private UsersDao usersDao;
}
