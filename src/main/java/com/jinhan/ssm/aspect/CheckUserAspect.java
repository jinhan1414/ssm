package com.jinhan.ssm.aspect;

import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //定义为一个spring的bean组件
@Aspect  //定义为一个切面
public class CheckUserAspect {

	
	//定义一个切点
	@Pointcut("execution(* service.UserService.*(String))&&args(userId)")
	public void userPointCut(String userId){};
	
	//定义前置通知
	@Before("userPointCut(userId)")
	public void beforeUser(JoinPoint jp,String userId){
		if(userId.isEmpty()) throw new IllegalArgumentException("user id 不能为空");
	}
	
	//定义后置通知
	@AfterReturning(returning="user",pointcut="userPointCut(userId)")
	public void AfterUser(JoinPoint jp,String userId,Map user){
		if(user == null ||user.isEmpty()) throw new IllegalArgumentException("user不存在");
	}
	
	//定义环绕通知
	
	//定义异常通知
}
