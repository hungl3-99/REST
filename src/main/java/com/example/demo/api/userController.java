package com.example.demo.api;

import java.util.Map;
import java.util.Random;

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
import com.example.demo.Entity.UserCoV;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping(path = "/user", consumes = "application/json")
@CrossOrigin(origins = "*")
public class userController {
	@Autowired
	EntityLinks entityLinks;
	
	private UserRepository userRepo;
	public userController(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}


	/*@PostMapping(path = "/login" )
	@ResponseStatus(HttpStatus.CREATED)
	public User postLogin(@RequestBody String params) throws JsonMappingException, JsonProcessingException {
		User user = new User();
		
		ObjectMapper mapper = new ObjectMapper();
		
		UserCoV userCoV = mapper.readValue(params, UserCoV.class);

		user.setEmail(userCoV.getEmail());
		user.setPassword(userCoV.getPassword());
		
		System.out.println(params);
		
		char[] chars = "abcdefghijklmnopqrstuvwxyzAWERTYUIOPASDFGHJKLZXCVBNM1234567890".toCharArray();
		StringBuilder sb = new StringBuilder(20);
		Random random = new Random();
		for (int i = 0; i < 40; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		
		user.setToken(output);
		System.out.println(output);
		return userRepo.save(user);
	}*/
	
	
	@GetMapping("/getall")
	public Iterable<User> getAllUsers(){
		return userRepo.findAll();
		
	}
	
	
}
