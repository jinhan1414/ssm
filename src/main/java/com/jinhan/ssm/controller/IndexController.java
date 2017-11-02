package com.jinhan.ssm.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinhan.ssm.domain.UserDomain;
import com.jinhan.ssm.service.UserService;


@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	UserService userService;
	
	@RequestMapping("sayHello")   
	public String hello(@RequestParam("name") String name,Model model){
		
		model.addAttribute("name", name);
		return "hello";  //hello表示jsp的文件名为hello.jsp
	}
	
	@RequestMapping("maps")
	@ResponseBody  //这个表示不使用视图进行渲染
	public  UserDomain getMaps(@RequestParam("name") String name){		
		UserDomain user = new UserDomain();
		user.setName(name);
		return user;
	}
	
	@RequestMapping("userInfo")
	@ResponseBody  //这个表示不使用视图进行渲染
	public Map getUserInfo(@RequestParam("id") String id) throws Exception{
		return userService.getUser(id);
	}
	
	@MessageMapping("/greeting")
	public UserDomain greeting(UserDomain user){
		
		System.out.println("---------------"+user.getName()+"-------------------");
		return user;
		
	}
}
