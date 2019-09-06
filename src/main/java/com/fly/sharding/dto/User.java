package com.fly.sharding.dto;

import java.io.Serializable;

import com.fly.sharding.enums.UserSexEnum;

import lombok.Data;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = 4235586106357903696L;
	private Long id;
	private Long order_id;
	private Long user_id;
	private String userName;
	private String passWord;
	private UserSexEnum userSex;
	private String nickName;
}
