package com.jinhan.ssm.domain.myself;

import lombok.Data;

/**
 * @author jinchengsong
 * @date 2017年10月27日
 * ProjectDO.java
 */
@Data
public class ProjectDO {

	/**
	 * 项目名称
	 */
	String name;
	
	/**
	 * 项目地址
	 */
	String url;
	
	/**
	 * 项目简介
	 */
	String overView;
	
	/**
	 * 项目内容
	 */
	String content;
}

