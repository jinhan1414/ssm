package service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.UserMapper;

@Service
public class UserService {

	@Resource
	UserMapper userMaper;
	
	public Map getUser(String id) throws Exception {		
		if(id.isEmpty())
		   throw new Exception("用户id不能为空");
		return userMaper.getUser(id);
	}

}
