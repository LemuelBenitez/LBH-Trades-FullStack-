package com.lbh_trades_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbh_trades_server.modal.User;
import com.lbh_trades_server.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/signup")
	public ResponseEntity<User> register(User user) {
		User savedUser = new User();
		savedUser.setEmail(user.getEmail());
		savedUser.setPassword(user.getPassword());

		User save = userRepository.save(savedUser);

		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}
}
