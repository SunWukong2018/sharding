package com.fly.sharding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fly.sharding.dto.User;
import com.fly.sharding.enums.UserSexEnum;
import com.fly.sharding.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		List<User> users = userService.getUsers();
		return users;
	}

	// 测试
	@RequestMapping(value = "update1")
	public String updateTransactional(@RequestBody User user) {
		user.setUserSex(UserSexEnum.WOMAN);
		userService.updateTransactional(user);
		return "test";
	}
}
