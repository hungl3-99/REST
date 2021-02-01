package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;



@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "*")
public class userController {
	@Autowired
	private UserRepository userRepo;
	EntityLinks entityLinks;
	
	@PostMapping(path = "/login" , consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public User postLogin(@RequestParam(value = "params") String params) {
		User user = new User();
		System.out.println(params);
		return userRepo.save(user);
	}
}
