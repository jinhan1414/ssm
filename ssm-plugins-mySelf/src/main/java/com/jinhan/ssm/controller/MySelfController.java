package com.jinhan.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinhan.ssm.domain.myself.ArticleDO;
import com.jinhan.ssm.domain.myself.PersonDO;
import com.jinhan.ssm.domain.myself.ProjectDO;
import com.jinhan.ssm.domain.myself.SkillDO;
import com.jinhan.ssm.domain.myself.SkillLevel;
import com.jinhan.ssm.domain.myself.WorkDO;


@Controller
@RequestMapping("mySelf")
public class MySelfController {
	
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
		person.setName("閲戞垚鏉�");
		person.setSex("鐢�");
		person.setEducation("鏈");
		person.setAddress("鍥涘窛鎴愰兘");
		person.setEmail("jinhan1414@gmail.com");
		return person;
	}
	
	private List<WorkDO> getWorks(){
		List<WorkDO> works = new ArrayList<WorkDO>();
		WorkDO work = new WorkDO();
		work.setIcon("timg.jpg");
		work.setName("浣滃搧鍚嶇О");
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
        project.setName("鍒涗笟鍒版斁寮�");
        project.setUrl("http://www.cnblogs.com/harveybarray/p/7742765.html");
        project.setOverView("浠婂勾6鏈堬紝鍘熷叕鍙镐竴钁ｄ簨涓庡叕鍙搁珮灞傛湁浜涗笉鎰夊揩锛屽喅瀹氬嚭鏉ュ垱涓氥�傚綋鏃朵富瑕佹槸钁ｄ簨涓庝竴涓富绋嬪湪绉佷笅鍟嗛噺缁嗚妭闂銆傚喅瀹氬ソ浠ュ悗锛屾墠鍙笂鎴戜笌鍙︿竴涓悓浜嬨�傚綋鏃惰懀浜嬭鐨勬槸浠栨湁璁稿 鏈嬪弸鑷繁鍑烘潵鎼炰簡锛岄兘鎼炲緱濂姐�傚紕寰楁渶濂界殑 涓�涓湅鍙嬫湀鍒╂鼎300W锛屾敹閽辨敹鐨勬墜杞紝浣嗘槸涓嬮潰鐨勭▼搴忔湁閽变簡锛岄兘椤剧潃涔拌溅涔版埧锛屼笉鎯冲幓鎼炴柊鐨勪骇鍝併�傞偅杈规�� ...");
		for(int i=0;i<3;i++){
			projects.add(project);
		}
		return projects;
	}
	
	private List<SkillDO> getSkills(){
		List<SkillDO> skills = new ArrayList<SkillDO>();

		for(int i=0;i<3;i++){
			SkillDO skill = new SkillDO();
			skill.setDirection("java鍚庡彴");
            
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
		artice.setTitle("缃戦〉鍗曚綅鍜宺em灏忓垎浜�");
		artice.setUrl("http://www.cnblogs.com/xiaoloulan/p/7742374.html");
		for(int i=0;i<10;i++){
			artices.add(artice);
		}
		return artices;
	}
}
