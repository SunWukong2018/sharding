package com.fly.sharding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.sharding.dao.UserDao;
import com.fly.sharding.dto.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUsers() {
		List<User> users = userDao.getAll();
		return users;
	}

	// @Transactional(value="test1TransactionManager",rollbackFor =Exception.class,timeout=36000)
	//说明针对Exception异常也进行回滚，如果不标注，则Spring 默认只有抛出 RuntimeException才会回滚事务
	public void updateTransactional(User user) {
		try {
			userDao.insert(user);
		} catch (Exception e) {
			log.error("find exception!");
			throw e; // 事物方法中，如果使用trycatch捕获异常后，需要将异常抛出，否则事物不回滚。
		}

	}
}
