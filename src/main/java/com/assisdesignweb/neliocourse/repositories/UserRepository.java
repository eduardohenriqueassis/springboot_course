package com.assisdesignweb.neliocourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assisdesignweb.neliocourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
