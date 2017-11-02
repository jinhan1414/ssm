package com.jinhan.ssm.domain.myself;


import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

/**
 * @author jinchengsong
 * @date 2017年10月26日
 * PersonDO.java
 */
@Data
@JsonRootName("person")
public class PersonDO {
	
	/**
	 * 简历头像
	 */
	String head;

	/**
	 * 姓名
	 */
	String name;
	
	/**
	 * 性别
	 */
	String sex;
	
	/**
	 * 学历
	 */
	String education;
	

	/**
	 * 地址
	 */
	String address;
	
	/**
	 * 邮箱
	 */
	String email;

}
