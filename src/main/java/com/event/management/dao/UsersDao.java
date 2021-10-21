package com.event.management.dao;

import com.event.management.model.Login;
import com.event.management.model.Users;

public interface UsersDao{

	Users register(Users user);

	Users getUserByEmail(String email);

	String updatePassword(String email, String password);

	String login(Login credentials);
}
