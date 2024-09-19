package com.api_example.docker_api_example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_example.docker_api_example.models.User;
import com.api_example.docker_api_example.models.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private String message = "User has been deleted";
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/{uid}")
	public User getUserByUid(@PathVariable Integer uid) {
		return userRepository.findById(uid).orElse(null);
	}

	@GetMapping()
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PutMapping("/{uid}")
	public User updateUser(@PathVariable Integer uid, @RequestBody User userDetails) {
		User user = userRepository.findById(uid).orElse(null);
		if (user != null) {
			user.setFirstName(userDetails.getFirstName());
			user.setLastName(userDetails.getLastName());
			user.setEmail(userDetails.getEmail());
			return userRepository.save(user);
		}
		return user;
	}

	@DeleteMapping("/{uid}")
	public String deleteUser(@PathVariable Integer uid) {
		userRepository.deleteById(uid);
		return message;
	}
}
