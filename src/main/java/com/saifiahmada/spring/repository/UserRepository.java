package com.saifiahmada.spring.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.saifiahmada.spring.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByName(String name);
}
