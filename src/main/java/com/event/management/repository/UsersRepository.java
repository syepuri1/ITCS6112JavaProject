package com.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.management.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
