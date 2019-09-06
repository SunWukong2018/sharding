package com.fly.sharding.dao;

import java.util.List;
import com.fly.sharding.dto.User;


public interface UserDao {

	List<User> getAll();

	void insert(User user);

}
