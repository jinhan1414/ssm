package domain.myself;

import java.util.List;

import lombok.Data;

/**
 * @author jinchengsong
 * @date 2017年10月27日
 * SkillDO.java
 */
@Data
public class SkillDO {
	
	/*
	 * 技能方向
	 */
	String direction;
	
	/**
	 * 技能等级集合
	 */
	List<SkillLevel> skillLevels;
	
	

}
