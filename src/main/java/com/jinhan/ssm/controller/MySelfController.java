package com.jinhan.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinhan.ssm.domain.myself.ArticleDO;
import com.jinhan.ssm.domain.myself.PersonDO;
import com.jinhan.ssm.domain.myself.ProjectDO;
import com.jinhan.ssm.domain.myself.SkillDO;
import com.jinhan.ssm.domain.myself.SkillLevel;
import com.jinhan.ssm.domain.myself.WorkDO;
import com.jinhan.ssm.service.UserService;


@Controller
@RequestMapping("mySelf")
public class MySelfController {

	@Resource
	UserService userService;
	
	@RequestMapping("mySelf")  
	public String mySelf(Model model){
		
		model.addAttribute(getPerson());
		model.addAttribute("workDOs",getWorks());
		model.addAttribute("projectDOs",getProjects());
		model.addAttribute("skillDOs",getSkills());
		model.addAttribute("articeDOs",getArtices());
		return "mySelf/mySelf";
	}
	
	@RequestMapping("mySelfManage")
	public String mySelfManage(){
		
		return "mySelf/mySelfManage";
	}
	
	private PersonDO getPerson(){
		PersonDO person = new PersonDO();
		person.setHead("selfHead");
		person.setName("金成松");
		person.setSex("男");
		person.setEducation("本科");
		person.setAddress("四川成都");
		person.setEmail("jinhan1414@gmail.com");
		return person;
	}
	
	private List<WorkDO> getWorks(){
		List<WorkDO> works = new ArrayList<WorkDO>();
		WorkDO work = new WorkDO();
		work.setIcon("timg.jpg");
		work.setName("作品名称");
		work.setUrl("https://www.baidu.com");
		for(int i=0;i<8;i++){
			//work.setName(work.getName()+1);
			works.add(work);
		}
		return works;
	}
	
	private List<ProjectDO> getProjects(){
		List<ProjectDO> projects = new ArrayList<ProjectDO>();
		ProjectDO project = new ProjectDO();
        project.setName("创业到放弃");
        project.setUrl("http://www.cnblogs.com/harveybarray/p/7742765.html");
        project.setOverView("今年6月，原公司一董事与公司高层有些不愉快，决定出来创业。当时主要是董事与一个主程在私下商量细节问题。决定好以后，才叫上我与另一个同事。当时董事说的是他有许多 朋友自己出来搞了，都搞得好。弄得最好的 一个朋友月利润300W，收钱收的手软，但是下面的程序有钱了，都顾着买车买房，不想去搞新的产品。那边急 ...");
		for(int i=0;i<3;i++){
			projects.add(project);
		}
		return projects;
	}
	
	private List<SkillDO> getSkills(){
		List<SkillDO> skills = new ArrayList<SkillDO>();

		for(int i=0;i<3;i++){
			SkillDO skill = new SkillDO();
			skill.setDirection("java后台");
            
            List<SkillLevel> leves = new ArrayList<SkillLevel>();
			for(int j=0;j<5;j++){
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setLevel("1");
				skillLevel.setName("spring");
				leves.add(skillLevel);
			}
			skill.setSkillLevels(leves);
			skills.add(skill);
		}
		return skills;
	}
	
	private List<ArticleDO> getArtices(){
		List<ArticleDO> artices = new ArrayList<ArticleDO>();
		ArticleDO artice = new ArticleDO();
		artice.setTitle("网页单位和rem小分享");
		artice.setUrl("http://www.cnblogs.com/xiaoloulan/p/7742374.html");
		for(int i=0;i<10;i++){
			artices.add(artice);
		}
		return artices;
	}
}
