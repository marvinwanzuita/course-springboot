package com.marvinwzt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvinwzt.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
