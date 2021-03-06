package controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext; 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml","classpath*:config/spring-mvc-servlet.xml"})
@ActiveProfiles("oracle")
//@ActiveProfiles("sqlite")
@WebAppConfiguration
public class IndexControllerTest {
    
	@Autowired
	private WebApplicationContext appContent;
	private MockMvc mockMvc;
	
    @Before  
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.appContent).build();  
    }
    
    //测试返回带视图的控制器方法
	@Test
	public void testHello() throws Exception {
		mockMvc.perform(get("/sayHello?name=1414")).andExpect(status().isOk())
		.andExpect(view().name("hello")) //测试返回的视图名是否匹配
		.andExpect(model().attribute("name", "1414"));//测试返回的模型是否包含相应的属性
	}

	//测试不带视图的控制器方法（返回xml数据）
	@Test
	public void testGetMapsReturnXml() throws Exception {
		mockMvc.perform(get("/maps?name=1414").accept(MediaType.APPLICATION_XML))
		.andExpect(status().isOk())
		.andExpect(content().string("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><userDomain><name>1414</name></userDomain>"));//测试返回
		
	}
	
	//测试不带视图的控制器方法（返回json数据）
	@Test
	public void testGetMapsReruenJson() throws Exception {
		mockMvc.perform(get("/maps?name=1414").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().string("{\"name\":\"1414\"}"));//测试返回
		
	}

	@Test
	public void testGetUserInfo() throws Exception {
		mockMvc.perform(get("/userInfo?id=1")).andExpect(status().isOk())
		.andExpect(content().string("{\"PASSWORDFAULTNUM\":0,\"SEX\":\"1\",\"EFFECTIVE\":\"0\",\"PWDLASTMODIFYDATE\":1503284178000,\"NAME\":\"超级管理员\",\"ISLOCK\":\"0\",\"CREATEUSER\":1,\"DIRECTORGID\":1,\"PASSWORD\":\"29PYtt0CYAXxrlJgzd/HUg==\",\"LOGINID\":\"developer\",\"USERID\":1,\"SORT\":0,\"TYPEFLAG\":0,\"TEL\":\"0\",\"CREATETIME\":1442998469000}"));
	}

}
