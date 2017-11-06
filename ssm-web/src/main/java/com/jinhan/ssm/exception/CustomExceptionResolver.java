package com.jinhan.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class CustomExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			final Exception ex) {
		
		//MappingJackson2JsonView 返回json数据格式
		return new ModelAndView(new MappingJackson2JsonView()){
			{
				addObject("success", false);
				addObject("msg", ex.getMessage());
				addObject("exceptionType",ex.getClass().getName());
			}
		};
	}

}
