package controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mapper.UserMapper;
import service.UserService;


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
	public Map getMaps(@RequestParam("name") String name){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", name);
		return hm;
	}
	
	@RequestMapping("userInfo")
	@ResponseBody  //这个表示不使用视图进行渲染
	public Map getUserInfo(@RequestParam("id") String id) throws Exception{
		return userService.getUser(id);
	}
}
