package com.springboot.security.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value="user/public/{id}")
	public String getPublicUserById(@PathVariable String id) {
		return "User name = Maneesh and ID = " + id;
	}
	
	@RequestMapping(value="user/private/{id}")
	public String getPrivateUserById(@PathVariable String id) {
		return "User name = Maneesh and ID = " + id;
	}
	
	@RequestMapping(value="user/private/admin/{id}")
	public String getPrivateAdminUserById(@PathVariable String id) {
		return "User name = Maneesh and ID = " + id;
	}
}
