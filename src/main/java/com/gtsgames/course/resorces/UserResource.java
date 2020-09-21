package com.gtsgames.course.resorces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtsgames.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l, "Maria", "Maria@gmail.com", "099909999", "huashud232");
		return ResponseEntity.ok().body(u);
	}
}
