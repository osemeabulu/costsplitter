package com.slg.costsplitter.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@RequestMapping("/users/{id}")
	public List<User> getUsersInTrip(String id) {
		return new ArrayList<User>();
	
	}

}
