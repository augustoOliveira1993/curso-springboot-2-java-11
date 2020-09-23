package com.gtsgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtsgames.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
