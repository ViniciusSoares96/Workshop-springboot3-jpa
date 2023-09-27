package com.educandoWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoWeb.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
