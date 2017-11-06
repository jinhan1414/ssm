package com.jinhan.ssm.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinhan.ssm.mapper.UserMapper;


@Service
public class UserService {

	@Resource
	UserMapper userMaper;
	
	public Map getUser(String id) throws Exception {		
		return userMaper.getUser(id);
	}

}
